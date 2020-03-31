
/**
 * Write a description of Part2 here.
 * 
 * @author Adrish Reddy Komma 
 * @on 31 March 2020
 */
public class Part2 {
    public String findSimpleGene(String dna,String startCodon,String stopCodon)
    {
         String result = "";
        if( Character.isUpperCase(dna.charAt(0)) ) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        } 
        else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        int indexOfATG=dna.indexOf(startCodon);
        if(indexOfATG==-1)
            return "";
        int indexOfTAA=dna.indexOf(stopCodon,indexOfATG);
        if(indexOfTAA==-1)
            return "";
        if ((indexOfTAA-indexOfATG)%3==0)
            return dna.substring(indexOfTAA,indexOfATG+3);
        else
            return "";
    }
     public void testSimpleGene() {
        String dna1 = "CCATCAATAACATGA";
	String dna2 = "CCAATGCAGCGATAC";
	String dna3 = "CTAATCCGGATCCGA";
	String dna4 = "ccagcatgccagtcagctaacag";
	String dna5 = "CCAGCATGCCAGTAGCTAACAG";
		
	System.out.println("The string is: " + dna1+ ". The Gene is: " + findSimpleGene(dna1, "ATG", "TAA"));
	System.out.println("The string is: " + dna2+ ". The Gene is: " + findSimpleGene(dna2, "ATG", "TAA"));
	System.out.println("The string is: " + dna3+ ". The Gene is: " + findSimpleGene(dna3, "ATG", "TAA"));
	System.out.println("The string is: " + dna4+ ". The Gene is: " + findSimpleGene(dna4, "ATG", "TAA"));
	System.out.println("The string is: " + dna5 + ". The Gene is: " + findSimpleGene(dna5, "ATG", "TAA"));
    }
    public static void main (String[] args) {
        Part2 gene = new Part2();
        gene.testSimpleGene();
    }
}
