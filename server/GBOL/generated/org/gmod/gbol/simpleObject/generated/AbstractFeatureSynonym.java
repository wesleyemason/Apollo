package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * FeatureSynonym generated by hbm2java
 */
public abstract class AbstractFeatureSynonym extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featureSynonymId;
     private Publication publication;
     private Feature feature;
     private Synonym synonym;
     private boolean isCurrent;
     private boolean isInternal;

    public AbstractFeatureSynonym() {
    }

    public AbstractFeatureSynonym(Publication publication, Feature feature, Synonym synonym, boolean isCurrent, boolean isInternal) {
       this.publication = publication;
       this.feature = feature;
       this.synonym = synonym;
       this.isCurrent = isCurrent;
       this.isInternal = isInternal;
    }
   
    public Integer getFeatureSynonymId() {
        return this.featureSynonymId;
    }
    
    public void setFeatureSynonymId(Integer featureSynonymId) {
        this.featureSynonymId = featureSynonymId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    public Synonym getSynonym() {
        return this.synonym;
    }
    
    public void setSynonym(Synonym synonym) {
        this.synonym = synonym;
    }
    public boolean isIsCurrent() {
        return this.isCurrent;
    }
    
    public void setIsCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
    public boolean isIsInternal() {
        return this.isInternal;
    }
    
    public void setIsInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractFeatureSynonym) ) return false;
         AbstractFeatureSynonym castOther = ( AbstractFeatureSynonym ) other; 
         
         return ( (this.getPublication()==castOther.getPublication()) || ( this.getPublication()!=null && castOther.getPublication()!=null && this.getPublication().equals(castOther.getPublication()) ) )
 && ( (this.getFeature()==castOther.getFeature()) || ( this.getFeature()!=null && castOther.getFeature()!=null && this.getFeature().equals(castOther.getFeature()) ) )
 && ( (this.getSynonym()==castOther.getSynonym()) || ( this.getSynonym()!=null && castOther.getSynonym()!=null && this.getSynonym().equals(castOther.getSynonym()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getPublication() == null ? 0 : this.getPublication().hashCode() );
         result = 37 * result + ( getFeature() == null ? 0 : this.getFeature().hashCode() );
         result = 37 * result + ( getSynonym() == null ? 0 : this.getSynonym().hashCode() );
         
         
         return result;
   }   

public AbstractFeatureSynonym generateClone() {
    AbstractFeatureSynonym cloned = new AbstractFeatureSynonym; 
           cloned.publication = this.publication;
           cloned.feature = this.feature;
           cloned.synonym = this.synonym;
           cloned.isCurrent = this.isCurrent;
           cloned.isInternal = this.isInternal;
    return cloned;
}


}


