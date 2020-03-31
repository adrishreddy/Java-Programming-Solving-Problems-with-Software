
/**
 * Write a description of Part3 here.
 * 
 * @author Adrish Reddy Komma 
 * @on 31 March 2020
 */
public class Part3 {
    public boolean twoOccurrences(String a,String b)
    {
        int aIndex=b.indexOf(a);
        if(aIndex!=-1)
        {
            int bIndex=b.indexOf(a,aIndex+1);
            if(bIndex!=-1)
            {
                return true;
            }
            else
                return false;
        }
        return false; 
    }
    public void testing()
    {
        System.out.println(twoOccurrences("by", "A story by Abby Long"));
        System.out.println(twoOccurrences("a", "banana"));
        System.out.println(twoOccurrences("atg", "ctgtatgta"));
        System.out.println(lastPart("an", "banana"));
        System.out.println(lastPart("zoo", "forest"));
        System.out.println(lastPart("zoo", "farzookeeper"));
        
    }
    public String lastPart(String stringa, String stringb) {
        if(stringb.indexOf(stringa) != -1) {
            int index = stringb.indexOf(stringa);
            return stringb.substring(index+stringa.length(), stringb.length());
        } 
        else {
            return stringb;
        }
    }
    
    public static void main() {
        Part3 howMany = new Part3();
        howMany.testing();
    }
}
