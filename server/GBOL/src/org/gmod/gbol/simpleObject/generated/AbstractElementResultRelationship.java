package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * ElementResultRelationship generated by hbm2java
 */
public abstract class AbstractElementResultRelationship extends AbstractSimpleObject implements java.io.Serializable {


     private Integer elementResultRelationshipId;
     private ElementResult subjectElementResult;
     private CVTerm type;
     private ElementResult objectElementResult;
     private String value;
     private int rank;

    public AbstractElementResultRelationship() {
    }

    
    public AbstractElementResultRelationship(ElementResult subjectElementResult, CVTerm type, ElementResult objectElementResult, int rank) {
        this.subjectElementResult = subjectElementResult;
        this.type = type;
        this.objectElementResult = objectElementResult;
        this.rank = rank;
    }
    public AbstractElementResultRelationship(ElementResult subjectElementResult, CVTerm type, ElementResult objectElementResult, String value, int rank) {
       this.subjectElementResult = subjectElementResult;
       this.type = type;
       this.objectElementResult = objectElementResult;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getElementResultRelationshipId() {
        return this.elementResultRelationshipId;
    }
    
    public void setElementResultRelationshipId(Integer elementResultRelationshipId) {
        this.elementResultRelationshipId = elementResultRelationshipId;
    }
    public ElementResult getSubjectElementResult() {
        return this.subjectElementResult;
    }
    
    public void setSubjectElementResult(ElementResult subjectElementResult) {
        this.subjectElementResult = subjectElementResult;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public ElementResult getObjectElementResult() {
        return this.objectElementResult;
    }
    
    public void setObjectElementResult(ElementResult objectElementResult) {
        this.objectElementResult = objectElementResult;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractElementResultRelationship) ) return false;
         AbstractElementResultRelationship castOther = ( AbstractElementResultRelationship ) other; 
         
         return ( (this.getSubjectElementResult()==castOther.getSubjectElementResult()) || ( this.getSubjectElementResult()!=null && castOther.getSubjectElementResult()!=null && this.getSubjectElementResult().equals(castOther.getSubjectElementResult()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getObjectElementResult()==castOther.getObjectElementResult()) || ( this.getObjectElementResult()!=null && castOther.getObjectElementResult()!=null && this.getObjectElementResult().equals(castOther.getObjectElementResult()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getSubjectElementResult() == null ? 0 : this.getSubjectElementResult().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getObjectElementResult() == null ? 0 : this.getObjectElementResult().hashCode() );
         
         
         return result;
   }   

public AbstractElementResultRelationship generateClone() {
    AbstractElementResultRelationship cloned = new ElementResultRelationship(); 
           cloned.subjectElementResult = this.subjectElementResult;
           cloned.type = this.type;
           cloned.objectElementResult = this.objectElementResult;
           cloned.value = this.value;
           cloned.rank = this.rank;
    return cloned;
}


}


