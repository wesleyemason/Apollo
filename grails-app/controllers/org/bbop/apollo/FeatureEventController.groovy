package org.bbop.apollo

import grails.converters.JSON
import org.bbop.apollo.history.FeatureEventView
import org.codehaus.groovy.grails.web.json.JSONArray
import org.codehaus.groovy.grails.web.json.JSONObject

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FeatureEventController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def changesValues(){

        JSONObject jsonObject = new JSONObject()

        jsonObject.testValue = "yeah its working"
        JSONArray changesArray = new JSONArray()
        for(FeatureEvent featureEvent : FeatureEvent.list([max:10])){
            JSONObject jsonObject1 = new JSONObject()
            jsonObject1.operation = featureEvent.operation.name()
            changesArray.add(jsonObject1)
        }

        jsonObject.changes = changesArray


        render jsonObject as JSON
    }

    def changes2(){
        render view:"changes2",model:[organismInstance:Organism.first()]
    }

    def changes(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        Map<String, FeatureEvent> featureEventList = new HashMap<>()
        Map<String, Feature> features = new HashMap<>()

        FeatureEvent.list(params).each {
            featureEventList.put(it.uniqueName, it)
        }
        Feature.findAllByUniqueNameInList(featureEventList.keySet() as List).each {
            features.put(it.uniqueName, it)
        }
        assert featureEventList.size() == features.size()

        List<FeatureEventView> featureEventViewList = new ArrayList<>()
        featureEventList.each {
            FeatureEventView featureEventView = new FeatureEventView()
            featureEventView.featureEvent = it.value
            Feature feature = features.get(it.key)
            featureEventView.feature = feature
            featureEventView.organismId = feature.featureLocation.sequence.organismId
            String locationString = feature.featureLocation.sequence.name + ":"
            locationString += feature.featureLocation.fmin + ".." + feature.featureLocation.fmax
            featureEventView.locString = locationString
            featureEventViewList.add(featureEventView)
        }

        render view: "changes", model: [featureEventViewList: featureEventViewList, featureEventInstanceCount: FeatureEvent.count()]
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond FeatureEvent.list(params), model: [featureEventInstanceCount: FeatureEvent.count()]
    }

    def show(FeatureEvent featureEventInstance) {
        respond featureEventInstance
    }

    def create() {
        respond new FeatureEvent(params)
    }

    @Transactional
    def save(FeatureEvent featureEventInstance) {
        if (featureEventInstance == null) {
            notFound()
            return
        }

        if (featureEventInstance.hasErrors()) {
            respond featureEventInstance.errors, view: 'create'
            return
        }

        featureEventInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'featureEvent.label', default: 'FeatureEvent'), featureEventInstance.id])
                redirect featureEventInstance
            }
            '*' { respond featureEventInstance, [status: CREATED] }
        }
    }

    def edit(FeatureEvent featureEventInstance) {
        respond featureEventInstance
    }

    @Transactional
    def update(FeatureEvent featureEventInstance) {
        if (featureEventInstance == null) {
            notFound()
            return
        }

        if (featureEventInstance.hasErrors()) {
            respond featureEventInstance.errors, view: 'edit'
            return
        }

        featureEventInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'FeatureEvent.label', default: 'FeatureEvent'), featureEventInstance.id])
                redirect featureEventInstance
            }
            '*' { respond featureEventInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(FeatureEvent featureEventInstance) {

        if (featureEventInstance == null) {
            notFound()
            return
        }

        featureEventInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'FeatureEvent.label', default: 'FeatureEvent'), featureEventInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'featureEvent.label', default: 'FeatureEvent'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}