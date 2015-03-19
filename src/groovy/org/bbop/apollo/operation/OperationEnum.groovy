package org.bbop.apollo.operation

/**
 * Created by ndunn on 3/13/15.
 */
enum OperationEnum {
    ADD_FEATURE(DELETE_FEATURE),
    DELETE_FEATURE(ADD_FEATURE),
    ADD_TRANSCRIPT(DELETE_TRANSCRIPT),
    DELETE_TRANSCRIPT(ADD_TRANSCRIPT),
    ADD_EXON(DELETE_EXON),
    DELETE_EXON(ADD_EXON),
    MERGE_EXONS(SPLIT_EXON),
    SPLIT_EXON(MERGE_EXONS),
    SET_EXON_BOUNDARIES,
    MERGE_TRANSCRIPTS(SPLIT_TRANSCRIPT),
    SPLIT_TRANSCRIPT(MERGE_TRANSCRIPTS),
    SET_TRANSLATION_START(UNSET_TRANSLATION_START),
    UNSET_TRANSLATION_START(SET_TRANSLATION_START),
    SET_TRANSLATION_END(UNSET_TRANSLATION_END),
    UNSET_TRANSLATION_END(SET_TRANSLATION_END),
    SET_TRANSLATION_ENDS(UNSET_TRANSLATION_END),
    SET_LONGEST_ORF,
    FLIP_STRAND,
    SET_READTHROUGH_STOP_CODON(UNSET_READTHROUGH_STOP_CODON),
    UNSET_READTHROUGH_STOP_CODON(SET_READTHROUGH_STOP_CODON),
    SET_BOUNDARIES;
    
   
    private OperationEnum reverseValue

    public OperationEnum(){
        this.reverseValue = this
    }
    
    public OperationEnum(OperationEnum reverseOperation){
        this.reverseValue = reverseOperation
    }

    OperationEnum getReverseValue() {
        return reverseValue
    }
}