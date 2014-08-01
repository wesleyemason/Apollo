package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * Channel generated by hbm2java
 */
public abstract class AbstractChannel extends AbstractSimpleObject implements java.io.Serializable {


     private Integer channelId;
     private String name;
     private String definition;

    public AbstractChannel() {
    }

    public AbstractChannel(String name, String definition) {
       this.name = name;
       this.definition = definition;
    }
   
    public Integer getChannelId() {
        return this.channelId;
    }
    
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDefinition() {
        return this.definition;
    }
    
    public void setDefinition(String definition) {
        this.definition = definition;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractChannel) ) return false;
         AbstractChannel castOther = ( AbstractChannel ) other; 
         
         return ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         return result;
   }   

public AbstractChannel generateClone() {
    AbstractChannel cloned = new Channel(); 
           cloned.name = this.name;
           cloned.definition = this.definition;
    return cloned;
}


}


