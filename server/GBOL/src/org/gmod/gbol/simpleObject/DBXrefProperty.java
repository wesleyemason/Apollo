package org.gmod.gbol.simpleObject;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.DBXrefProperty.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class DBXrefProperty extends org.gmod.gbol.simpleObject.generated.AbstractDBXrefProperty {

    private static final long serialVersionUID = 1L;

    public DBXrefProperty(){
        super();
    }

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
    
        public SimpleObjectIterator(DBXrefProperty dbxrefProp)
        {
            super(dbxrefProp);
        }
        
        public AbstractSimpleObject next()
        {
            DBXrefProperty dbxrefProp = (DBXrefProperty)object;
            AbstractSimpleObject retVal = null;
            if (status != Status.self) {
                retVal = soIter.next();
                if (status == Status.notSet) {
                    processSingletonIterator(Status.type, dbxrefProp.getType());
                }
                if (status == Status.type) {
                    AbstractSimpleObject newClone = processLastSingletonIterator();
                    ((DBXrefProperty)clone).setType((CVTerm) newClone);
                }
            } else {
                retVal = peek();
                status = Status.done;
            }
            current = retVal;
            return retVal;
        }
    }

}
