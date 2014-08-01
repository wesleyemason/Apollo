package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * Contact generated by hbm2java
 */
public abstract class AbstractContact extends AbstractSimpleObject implements java.io.Serializable {


     private Integer contactId;
     private CVTerm type;
     private String name;
     private String description;
     private Set<ContactRelationship> childContactRelationships = new HashSet<ContactRelationship>(0);
     private Set<ContactRelationship> parentContactRelationships = new HashSet<ContactRelationship>(0);

    public AbstractContact() {
    }

    
    public AbstractContact(String name) {
        this.name = name;
    }
    public AbstractContact(CVTerm type, String name, String description, Set<ContactRelationship> childContactRelationships, Set<ContactRelationship> parentContactRelationships) {
       this.type = type;
       this.name = name;
       this.description = description;
       this.childContactRelationships = childContactRelationships;
       this.parentContactRelationships = parentContactRelationships;
    }
   
    public Integer getContactId() {
        return this.contactId;
    }
    
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<ContactRelationship> getChildContactRelationships() {
        return this.childContactRelationships;
    }
    
    public void setChildContactRelationships(Set<ContactRelationship> childContactRelationships) {
        this.childContactRelationships = childContactRelationships;
    }
    public Set<ContactRelationship> getParentContactRelationships() {
        return this.parentContactRelationships;
    }
    
    public void setParentContactRelationships(Set<ContactRelationship> parentContactRelationships) {
        this.parentContactRelationships = parentContactRelationships;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractContact) ) return false;
         AbstractContact castOther = ( AbstractContact ) other; 
         
         return ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         
         
         return result;
   }   

public AbstractContact generateClone() {
    AbstractContact cloned = new AbstractContact; 
           cloned.type = this.type;
           cloned.name = this.name;
           cloned.description = this.description;
           cloned.childContactRelationships = this.childContactRelationships;
           cloned.parentContactRelationships = this.parentContactRelationships;
    return cloned;
}


}


