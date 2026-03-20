package StringPrograms;

import java.util.Arrays;

public class DuplicatesInString {
    public static void main(String[] args) {
        String str= "Automation";
        findingDuplicates(str.toLowerCase());
    }
    public static void findingDuplicates(String str)
    {
        char [] ch= str.toCharArray();
        Arrays.sort(ch);
        String sortedStr= new String(ch);
        for (int i=0;i<str.length();i++)
        {
            int count=1;
            while (i<str.length()-1 && sortedStr.charAt(i) ==sortedStr.charAt(i+1))
            {
                count++;
                i++;
            }
            if (count>1)
            {
                System.out.println(sortedStr.charAt(i)+" is repeated "+ count+" times");
            }
        }
    }
}
