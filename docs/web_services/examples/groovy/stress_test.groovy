#!/usr/bin/env groovy
scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
evaluate(new File("${scriptDir}/SampleFeatures.groovy"))
evaluate(new File("${scriptDir}/Apollo2Operations.groovy"))

import net.sf.json.JSONArray
import net.sf.json.JSONObject


@Grab(group = 'org.json', module = 'json', version = '20140107')
@Grab(group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.7')

String usageString = "stress_test.groovy <options>" +
        "Example: \n" +
        "./stress_test.groovy -iter 100 -concurrency 3 -username ndunn@me.com -password demo  -organism Honey2 -destinationurl http://localhost:8080/WebApollo2/ -load 10"

def cli = new CliBuilder(usage: 'stress_test.groovy <options>')
cli.setStopAtNonOption(true)
cli.destinationurl('URL of WebApollo 2.0.x instance to which annotations are to be loaded', required: true, args: 1)
cli.organism('organism common name', required: true, args: 1)
cli.username('username', required: true, args: 1)
cli.password('password', required: true, args: 1)
cli.concurrency('concurrent transaction', required: false, args: 1)
cli.iter('iter', required: false, args: 1)
cli.load('load level (0-10)', required: false, args: 1)

OptionAccessor options

try {
    options = cli.parse(args)

    if (!(options?.destinationurl && options?.organism && options?.username && options?.password)) {
        println "\n" + usageString
        return
    }
} catch (e) {
    println(e)
    return
}

String sequenceName = "Annotations-Group1.10"
int concurrency = options.concurrency ? Integer.parseInt(options.concurrency) : 1
int iter = options.iter ? Integer.parseInt(options.iter) : 1
int load = options.load ? Integer.parseInt(options.load) : 1
load = load < 1 ? 1 : load
load = load > 10 ? 10 : load

println "concurrency: ${concurrency}"
println "iter: ${iter}"
println "load: ${load}"


JSONArray inputArray = SampleFeatures.getSampleFeatures()
JSONArray sampleFeaturesArray = new JSONArray()
for(int i = 0 ; i < load ; i++){
   sampleFeaturesArray.add(inputArray.getJSONObject(i))
}
int sampleFeaturesSize = sampleFeaturesArray.size()

long startTime = System.currentTimeMillis()

for (int i = 0; i < (int) iter; i++) {

    def threads = []
    for (int j = 0; j < (int) concurrency; j++) {

        def thread = new Thread({
            JSONArray deleteArray = new JSONArray()
            def response = Apollo2Operations.triggerAddTranscript(options.destinationurl, options.username, options.password, options.organism, sequenceName, sampleFeaturesArray)
            println "response ${response.features.collect { it.uniquename }}"
            response.features.collect { it.uniquename }.each() { uniquename ->
                JSONObject jsonObject = new JSONObject()
                jsonObject.put("uniquename", uniquename)
                deleteArray.add(jsonObject)
            }
            Apollo2Operations.triggerRemoveTranscript(options.destinationurl, options.username, options.password, options.organism, sequenceName, deleteArray)
        })
        threads << thread
    }
    threads.each { it.start() }

    boolean threadsRunning = true
    while(threadsRunning){
        threadsRunning = false
        threads.each { Thread it ->
            if(it?.alive){
                threadsRunning = true
            }
        }
        sleep(50l)
    }
}

long totalTime = System.currentTimeMillis() - startTime
int totalFeatures = iter * concurrency * load
int totalTransactions = iter * concurrency

System.out.println("total: "+totalTime/1000f)
System.out.println("per iteration : "+totalTime/(iter*1000f))
System.out.println("per transaction: "+totalTime/(totalTransactions*1000f))
System.out.println("per feature: "+totalTime/(totalFeatures*1000f))





//sequenceArray = options.sequence_names.tokenize(',')
//for (String sequence in sequenceArray) {
//    String sequenceName = sequencePrefix + sequence
//    def featuresFromSource  = featuresResponse.features // contains list of mRNAs; Size == number of annotations on chromosome
//
//    for (def entity : featuresFromSource) {
//        JSONObject entityJSONObject = entity as JSONObject
//        newArray.location = entityJSONObject.location
//        newArray.type = entityJSONObject.type
//        newArray.name = entityJSONObject.name
//        //tmp.name = entityJSONObject.name.tokenize('-')[0]
//        newArray.children = Apollo2Operations.assignNewUniqueName(entityJSONObject.children,uniqueNamesMap)
//        if (entityJSONObject.type.name == 'repeat_region' || entityJSONObject.type.name == 'transposable_element') {
//            addFeaturesArray.add(0, newArray)
//        }
//        else {
//            addTranscriptArray.add(0, newArray)
//        }
//    }
//
//    if (addFeaturesArray.size() > 0) {
//        def response = Apollo2Operations.triggerAddFeature(options.destinationurl, options.username, options.password, options.organism, sequenceName, addFeaturesArray)
//        if (response == null) { return }
//        println "Migrate ${response.size()} features for ${sequence}"
//    }
//    if (addTranscriptArray.size() > 0) {
//        //println "ADDTRANSCRIPTARRAY: ${addTranscriptArray.toString()}"
//        def response = Apollo2Operations.triggerAddTranscript(options.destinationurl, options.username, options.password, options.organism, sequenceName, addTranscriptArray)
//        if (response == null) { return }
//        println "Migrate ${response.size()} transcripts for ${sequence}"
//    }
//
//    // keep stats
//    featuresMap.put(sequenceName, (addFeaturesArray.size() + addTranscriptArray.size()))
//    addFeaturesArray.clear()
//    addTranscriptArray.clear()
//}




