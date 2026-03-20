package StringPrograms;

public class countChars {
    public static void main(String[] args) {
        String str="Automation";
        countCharacters(str);
    }
    public static void countCharacters(String str)
    {
        char []strArray= str.toCharArray();

        int[] visited= new int[strArray.length];

        for(int i=0;i< strArray.length;i++) {
            if (visited[i] == 1)
                continue;


            int count = 1;

            for (int j = i + 1; j < strArray.length; j++) {
                if(strArray[i]==strArray[j])
                {
                    count++;
                    visited[j]=1;
                }
            }
            System.out.println(strArray[i] + " = "+count);
        }
        }
}
