
/**
 * Write a description of Part1 here.
 * 
 * @author Adrish Reddy Komma
 * @on 31-10-2020
 */
public class Part1 {
    public String findSimpleGene(String dna)
    {
        int indexOfATG=dna.indexOf("ATG");
        if(indexOfATG==-1)
            return "";
        int indexOfTAA=dna.indexOf("TAA",indexOfATG);
        if(indexOfTAA==-1)
            return "";
        if ((indexOfTAA-indexOfATG)%3==0)
            return dna.substring(indexOfTAA,indexOfATG+3);
        else
            return "";
    }
     public void testSimpleGene() {
        String dna1 = "AAATGCCCTAACTAGATTAAGAAACC";
	String dna2 = "CCAATGCAGCGATAC";
	String dna3 = "CTAATCCGGATCCGA";
	String dna4 = "CCAGCATGCCAGTCAGCTAACAG";
	String dna5 = "CCAGCATGCCAGTAGCTAACAG";
		
	System.out.println("The string is: " + dna1+ ". The Gene is: " + findSimpleGene(dna1));
	System.out.println("The string is: " + dna2+ ". The Gene is: " + findSimpleGene(dna2));
	System.out.println("The string is: " + dna3+ ". The Gene is: " + findSimpleGene(dna3));
	System.out.println("The string is: " + dna4+ ". The Gene is: " + findSimpleGene(dna4));
	System.out.println("The string is: " + dna5 + ". The Gene is: " + findSimpleGene(dna5));
    }
    public static void main (String[] args) {
        Part1 gene = new Part1();
        gene.testSimpleGene();
    }
}
