package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * PhylogeneticNodeOrganism generated by hbm2java
 */
public abstract class AbstractPhylogeneticNodeOrganism extends AbstractSimpleObject implements java.io.Serializable {


     private Integer phylogeneticNodeOrganismId;
     private Organism organism;
     private PhylogeneticNode phylogeneticNode;

    public AbstractPhylogeneticNodeOrganism() {
    }

    public AbstractPhylogeneticNodeOrganism(Organism organism, PhylogeneticNode phylogeneticNode) {
       this.organism = organism;
       this.phylogeneticNode = phylogeneticNode;
    }
   
    public Integer getPhylogeneticNodeOrganismId() {
        return this.phylogeneticNodeOrganismId;
    }
    
    public void setPhylogeneticNodeOrganismId(Integer phylogeneticNodeOrganismId) {
        this.phylogeneticNodeOrganismId = phylogeneticNodeOrganismId;
    }
    public Organism getOrganism() {
        return this.organism;
    }
    
    public void setOrganism(Organism organism) {
        this.organism = organism;
    }
    public PhylogeneticNode getPhylogeneticNode() {
        return this.phylogeneticNode;
    }
    
    public void setPhylogeneticNode(PhylogeneticNode phylogeneticNode) {
        this.phylogeneticNode = phylogeneticNode;
    }



public AbstractPhylogeneticNodeOrganism generateClone() {
    AbstractPhylogeneticNodeOrganism cloned = new AbstractPhylogeneticNodeOrganism; 
           cloned.organism = this.organism;
           cloned.phylogeneticNode = this.phylogeneticNode;
    return cloned;
}


}


