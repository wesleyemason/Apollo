package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * Element generated by hbm2java
 */
public abstract class AbstractElement extends AbstractSimpleObject implements java.io.Serializable {


     private Integer elementId;
     private Feature feature;
     private DBXref dbxref;
     private ArrayDesign arrayDesign;
     private CVTerm type;
     private Set<ElementResult> elementResults = new HashSet<ElementResult>(0);
     private Set<ElementRelationship> parentElementRelationships = new HashSet<ElementRelationship>(0);
     private Set<ElementRelationship> childElementRelationships = new HashSet<ElementRelationship>(0);

    public AbstractElement() {
    }

    
    public AbstractElement(ArrayDesign arrayDesign) {
        this.arrayDesign = arrayDesign;
    }
    public AbstractElement(Feature feature, DBXref dbxref, ArrayDesign arrayDesign, CVTerm type, Set<ElementResult> elementResults, Set<ElementRelationship> parentElementRelationships, Set<ElementRelationship> childElementRelationships) {
       this.feature = feature;
       this.dbxref = dbxref;
       this.arrayDesign = arrayDesign;
       this.type = type;
       this.elementResults = elementResults;
       this.parentElementRelationships = parentElementRelationships;
       this.childElementRelationships = childElementRelationships;
    }
   
    public Integer getElementId() {
        return this.elementId;
    }
    
    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public ArrayDesign getArrayDesign() {
        return this.arrayDesign;
    }
    
    public void setArrayDesign(ArrayDesign arrayDesign) {
        this.arrayDesign = arrayDesign;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public Set<ElementResult> getElementResults() {
        return this.elementResults;
    }
    
    public void setElementResults(Set<ElementResult> elementResults) {
        this.elementResults = elementResults;
    }
    public Set<ElementRelationship> getParentElementRelationships() {
        return this.parentElementRelationships;
    }
    
    public void setParentElementRelationships(Set<ElementRelationship> parentElementRelationships) {
        this.parentElementRelationships = parentElementRelationships;
    }
    public Set<ElementRelationship> getChildElementRelationships() {
        return this.childElementRelationships;
    }
    
    public void setChildElementRelationships(Set<ElementRelationship> childElementRelationships) {
        this.childElementRelationships = childElementRelationships;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractElement) ) return false;
         AbstractElement castOther = ( AbstractElement ) other; 
         
         return ( (this.getFeature()==castOther.getFeature()) || ( this.getFeature()!=null && castOther.getFeature()!=null && this.getFeature().equals(castOther.getFeature()) ) )
 && ( (this.getArrayDesign()==castOther.getArrayDesign()) || ( this.getArrayDesign()!=null && castOther.getArrayDesign()!=null && this.getArrayDesign().equals(castOther.getArrayDesign()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getFeature() == null ? 0 : this.getFeature().hashCode() );
         
         result = 37 * result + ( getArrayDesign() == null ? 0 : this.getArrayDesign().hashCode() );
         
         
         
         
         return result;
   }   

public AbstractElement generateClone() {
    AbstractElement cloned = new AbstractElement; 
           cloned.feature = this.feature;
           cloned.dbxref = this.dbxref;
           cloned.arrayDesign = this.arrayDesign;
           cloned.type = this.type;
           cloned.elementResults = this.elementResults;
           cloned.parentElementRelationships = this.parentElementRelationships;
           cloned.childElementRelationships = this.childElementRelationships;
    return cloned;
}


}


