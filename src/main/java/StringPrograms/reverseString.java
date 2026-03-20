package StringPrograms;

public class reverseString {
    public static void main(String[] args) {
        String str = "Reverse";
        reversingString(str.toLowerCase());
    }
    public static void reversingString(String str)
    {
         int n=str.length();
         String reverse="";
         char ch;
         for(int i=0;i<=n;i++)
         {
            ch=str.charAt(i);
            reverse=ch+reverse;
         }
         System.out.println(reverse);
    }
}