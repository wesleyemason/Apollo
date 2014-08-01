package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * ExpressionProperty generated by hbm2java
 */
public abstract class AbstractExpressionProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer expressionPropertyId;
     private Expression expression;
     private CVTerm type;
     private String value;
     private int rank;

    public AbstractExpressionProperty() {
    }

    
    public AbstractExpressionProperty(Expression expression, CVTerm type, int rank) {
        this.expression = expression;
        this.type = type;
        this.rank = rank;
    }
    public AbstractExpressionProperty(Expression expression, CVTerm type, String value, int rank) {
       this.expression = expression;
       this.type = type;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getExpressionPropertyId() {
        return this.expressionPropertyId;
    }
    
    public void setExpressionPropertyId(Integer expressionPropertyId) {
        this.expressionPropertyId = expressionPropertyId;
    }
    public Expression getExpression() {
        return this.expression;
    }
    
    public void setExpression(Expression expression) {
        this.expression = expression;
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
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractExpressionProperty) ) return false;
         AbstractExpressionProperty castOther = ( AbstractExpressionProperty ) other; 
         
         return ( (this.getExpression()==castOther.getExpression()) || ( this.getExpression()!=null && castOther.getExpression()!=null && this.getExpression().equals(castOther.getExpression()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getExpression() == null ? 0 : this.getExpression().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + this.getRank();
         return result;
   }   

public AbstractExpressionProperty generateClone() {
    AbstractExpressionProperty cloned = new AbstractExpressionProperty; 
           cloned.expression = this.expression;
           cloned.type = this.type;
           cloned.value = this.value;
           cloned.rank = this.rank;
    return cloned;
}


}


