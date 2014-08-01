package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * LibraryProperty generated by hbm2java
 */
public abstract class AbstractLibraryProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer libraryPropertyId;
     private CVTerm type;
     private Library library;
     private String value;
     private int rank;
     private Set<LibraryPropertyPublication> libraryPropertyPublications = new HashSet<LibraryPropertyPublication>(0);

    public AbstractLibraryProperty() {
    }

    
    public AbstractLibraryProperty(CVTerm type, Library library, int rank) {
        this.type = type;
        this.library = library;
        this.rank = rank;
    }
    public AbstractLibraryProperty(CVTerm type, Library library, String value, int rank, Set<LibraryPropertyPublication> libraryPropertyPublications) {
       this.type = type;
       this.library = library;
       this.value = value;
       this.rank = rank;
       this.libraryPropertyPublications = libraryPropertyPublications;
    }
   
    public Integer getLibraryPropertyId() {
        return this.libraryPropertyId;
    }
    
    public void setLibraryPropertyId(Integer libraryPropertyId) {
        this.libraryPropertyId = libraryPropertyId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public Library getLibrary() {
        return this.library;
    }
    
    public void setLibrary(Library library) {
        this.library = library;
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
    public Set<LibraryPropertyPublication> getLibraryPropertyPublications() {
        return this.libraryPropertyPublications;
    }
    
    public void setLibraryPropertyPublications(Set<LibraryPropertyPublication> libraryPropertyPublications) {
        this.libraryPropertyPublications = libraryPropertyPublications;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractLibraryProperty) ) return false;
         AbstractLibraryProperty castOther = ( AbstractLibraryProperty ) other; 
         
         return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getLibrary()==castOther.getLibrary()) || ( this.getLibrary()!=null && castOther.getLibrary()!=null && this.getLibrary().equals(castOther.getLibrary()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getLibrary() == null ? 0 : this.getLibrary().hashCode() );
         
         result = 37 * result + this.getRank();
         
         return result;
   }   

public AbstractLibraryProperty generateClone() {
    AbstractLibraryProperty cloned = new LibraryProperty(); 
           cloned.type = this.type;
           cloned.library = this.library;
           cloned.value = this.value;
           cloned.rank = this.rank;
           cloned.libraryPropertyPublications = this.libraryPropertyPublications;
    return cloned;
}


}


