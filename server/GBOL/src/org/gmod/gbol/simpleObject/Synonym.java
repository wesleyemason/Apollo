package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.Synonym.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class Synonym extends org.gmod.gbol.simpleObject.generated.AbstractSynonym {

    private static final long serialVersionUID = 1L;

    public Synonym(){
        super();
    }

//    @Override
//    public Collection<AbstractSimpleObject> getWriteObjects() {
//        ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//        // Have to write yourself
//        writeObjects.add(this);
//        
//        // Singletons
//        writeObjects.addAll(this.getType().getWriteObjects());
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
            public final static int type = 1;
        }
    
        public SimpleObjectIterator(Synonym synonym)
        {
            super(synonym);
        }
        
        public AbstractSimpleObject next()
        {
            Synonym synonym = (Synonym)object;
            AbstractSimpleObject retVal = null;
            if (status == Status.self) {
                retVal = peek();
                processSingletonIterator(Status.type, synonym.getType());
            }
            else {
                if (status == Status.type) {
                    retVal = soIter.next();
                }
            }
            current = retVal;
            return retVal;
        }
    }

}
