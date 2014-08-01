package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * AnalysisProperty generated by hbm2java
 */
public abstract class AbstractAnalysisProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer analysisPropertyId;
     private Analysis analysis;
     private CVTerm type;
     private String value;

    public AbstractAnalysisProperty() {
    }

    
    public AbstractAnalysisProperty(Analysis analysis, CVTerm type) {
        this.analysis = analysis;
        this.type = type;
    }
    public AbstractAnalysisProperty(Analysis analysis, CVTerm type, String value) {
       this.analysis = analysis;
       this.type = type;
       this.value = value;
    }
   
    public Integer getAnalysisPropertyId() {
        return this.analysisPropertyId;
    }
    
    public void setAnalysisPropertyId(Integer analysisPropertyId) {
        this.analysisPropertyId = analysisPropertyId;
    }
    public Analysis getAnalysis() {
        return this.analysis;
    }
    
    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractAnalysisProperty) ) return false;
         AbstractAnalysisProperty castOther = ( AbstractAnalysisProperty ) other; 
         
         return ( (this.getAnalysis()==castOther.getAnalysis()) || ( this.getAnalysis()!=null && castOther.getAnalysis()!=null && this.getAnalysis().equals(castOther.getAnalysis()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getValue()==castOther.getValue()) || ( this.getValue()!=null && castOther.getValue()!=null && this.getValue().equals(castOther.getValue()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getAnalysis() == null ? 0 : this.getAnalysis().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getValue() == null ? 0 : this.getValue().hashCode() );
         return result;
   }   

public AbstractAnalysisProperty generateClone() {
    AbstractAnalysisProperty cloned = new AnalysisProperty(); 
           cloned.analysis = this.analysis;
           cloned.type = this.type;
           cloned.value = this.value;
    return cloned;
}


}


