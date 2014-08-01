package org.gmod.gbol.simpleObject;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.PublicationAuthor.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class PublicationAuthor extends org.gmod.gbol.simpleObject.generated.AbstractPublicationAuthor {

    private static final long serialVersionUID = 1L;

    public PublicationAuthor(){
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
        }
        
        public SimpleObjectIterator(PublicationAuthor pubAuthor)
        {
            super(pubAuthor);
        }

        public AbstractSimpleObject next()
        {
            AbstractSimpleObject retVal = null;
            if (status == Status.notSet) {
                retVal = peek();
                status = Status.done;
            }
            current = retVal;
            return retVal;
        }
    }

}
