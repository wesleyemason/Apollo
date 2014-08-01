package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * QuantificationProperty generated by hbm2java
 */
public abstract class AbstractQuantificationProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer quantificationPropertyId;
     private CVTerm type;
     private Quantification quantification;
     private String value;
     private int rank;

    public AbstractQuantificationProperty() {
    }

    
    public AbstractQuantificationProperty(CVTerm type, Quantification quantification, int rank) {
        this.type = type;
        this.quantification = quantification;
        this.rank = rank;
    }
    public AbstractQuantificationProperty(CVTerm type, Quantification quantification, String value, int rank) {
       this.type = type;
       this.quantification = quantification;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getQuantificationPropertyId() {
        return this.quantificationPropertyId;
    }
    
    public void setQuantificationPropertyId(Integer quantificationPropertyId) {
        this.quantificationPropertyId = quantificationPropertyId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public Quantification getQuantification() {
        return this.quantification;
    }
    
    public void setQuantification(Quantification quantification) {
        this.quantification = quantification;
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
         if ( !(other instanceof AbstractQuantificationProperty) ) return false;
         AbstractQuantificationProperty castOther = ( AbstractQuantificationProperty ) other; 
         
         return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getQuantification()==castOther.getQuantification()) || ( this.getQuantification()!=null && castOther.getQuantification()!=null && this.getQuantification().equals(castOther.getQuantification()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getQuantification() == null ? 0 : this.getQuantification().hashCode() );
         
         result = 37 * result + this.getRank();
         return result;
   }   

public AbstractQuantificationProperty generateClone() {
    AbstractQuantificationProperty cloned = new QuantificationProperty(); 
           cloned.type = this.type;
           cloned.quantification = this.quantification;
           cloned.value = this.value;
           cloned.rank = this.rank;
    return cloned;
}


}


