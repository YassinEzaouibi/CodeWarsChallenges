package codeworschallenges.kata_8.dna;

public class Dna {
    /*
    * Ribonucleic acid, RNA, is the primary messenger molecule in cells.
    * RNA differs slightly from DNA its chemical structure and contains no Thymine.
    * In RNA Thymine is replaced by another nucleic acid Uracil ('U').
    * Create a function which translates a given DNA string into RNA.
    * For example:
    * "GCAT"  =>  "GCAU"
    * The input string can be of arbitrary length - in particular, it may be empty.
    * All input is guaranteed to be valid, i.e. each input string will only ever consist of
    * 'G', 'C', 'A' and/or 'T'.
    * */
    public String dnaToRna(String dna) {
        if(dna.contains("T") && !dna.isEmpty() /*&& dna.equals("GCAT")*/){
            return dna.replace("T","U");
        }
        return dna;
    }
}
