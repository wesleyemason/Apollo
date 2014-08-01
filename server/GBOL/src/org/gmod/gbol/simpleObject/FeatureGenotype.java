package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeatureGenotype.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeatureGenotype extends org.gmod.gbol.simpleObject.generated.AbstractFeatureGenotype {

    private static final long serialVersionUID = 1L;

    public FeatureGenotype(){
        super();
    }

//    @Override
//    public Collection<AbstractSimpleObject> getWriteObjects() {
//        ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//        // Have to write yourself
//        writeObjects.add(this);
//        
//        // Singletons
//        writeObjects.addAll(this.getCvterm().getWriteObjects());
//        writeObjects.addAll(this.getGenotype().getWriteObjects());
//        writeObjects.addAll(this.getChromosomeFeature().getWriteObjects());
//        
//        return writeObjects;
//    }

    public AbstractSimpleObjectIterator getWriteableObjects()
    {
        return new SimpleObjectIterator(this);
    }

    private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
    {

        private static class Status extends AbstractSimpleObjectIterator.Status
        {
            public final static int cvterm = 1;
            public final static int genotype = 2;
            public final static int chromosomeFeature = 3;
        }
    
        public SimpleObjectIterator(FeatureGenotype cvterm)
        {
            super(cvterm);
        }
        
        public AbstractSimpleObject next()
        {
            FeatureGenotype genotype = (FeatureGenotype)object;
            AbstractSimpleObject retVal = null;
            if (status == Status.self) {
                retVal = peek();
                processSingletonIterator(Status.cvterm, genotype.getCvterm());
            }
            else {
                retVal = soIter.next();
                if (status == Status.cvterm) {
                    processSingletonIterator(Status.genotype, genotype.getGenotype());
                }
                if (status == Status.genotype) {
                    processSingletonIterator(Status.chromosomeFeature, genotype.getChromosomeFeature());
                }
            }
            current = retVal;
            return retVal;
        }
    }
    
}
