package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * Control generated by hbm2java
 */
public abstract class AbstractControl extends AbstractSimpleObject implements java.io.Serializable {


     private Integer controlId;
     private TableInfo tableInfo;
     private Assay assay;
     private CVTerm type;
     private int rowId;
     private String name;
     private String value;
     private int rank;

    public AbstractControl() {
    }

    
    public AbstractControl(TableInfo tableInfo, Assay assay, CVTerm type, int rowId, int rank) {
        this.tableInfo = tableInfo;
        this.assay = assay;
        this.type = type;
        this.rowId = rowId;
        this.rank = rank;
    }
    public AbstractControl(TableInfo tableInfo, Assay assay, CVTerm type, int rowId, String name, String value, int rank) {
       this.tableInfo = tableInfo;
       this.assay = assay;
       this.type = type;
       this.rowId = rowId;
       this.name = name;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getControlId() {
        return this.controlId;
    }
    
    public void setControlId(Integer controlId) {
        this.controlId = controlId;
    }
    public TableInfo getTableInfo() {
        return this.tableInfo;
    }
    
    public void setTableInfo(TableInfo tableInfo) {
        this.tableInfo = tableInfo;
    }
    public Assay getAssay() {
        return this.assay;
    }
    
    public void setAssay(Assay assay) {
        this.assay = assay;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public int getRowId() {
        return this.rowId;
    }
    
    public void setRowId(int rowId) {
        this.rowId = rowId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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
         if ( !(other instanceof AbstractControl) ) return false;
         AbstractControl castOther = ( AbstractControl ) other; 
         
         return ( (this.getTableInfo()==castOther.getTableInfo()) || ( this.getTableInfo()!=null && castOther.getTableInfo()!=null && this.getTableInfo().equals(castOther.getTableInfo()) ) )
 && ( (this.getAssay()==castOther.getAssay()) || ( this.getAssay()!=null && castOther.getAssay()!=null && this.getAssay().equals(castOther.getAssay()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRowId()==castOther.getRowId());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getTableInfo() == null ? 0 : this.getTableInfo().hashCode() );
         result = 37 * result + ( getAssay() == null ? 0 : this.getAssay().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + this.getRowId();
         
         
         
         return result;
   }   

public AbstractControl generateClone() {
    AbstractControl cloned = new Control(); 
           cloned.tableInfo = this.tableInfo;
           cloned.assay = this.assay;
           cloned.type = this.type;
           cloned.rowId = this.rowId;
           cloned.name = this.name;
           cloned.value = this.value;
           cloned.rank = this.rank;
    return cloned;
}


}


