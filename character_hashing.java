import java.util.Scanner;

public class character_hashing {
    

    static void printHash(int[] hash)
    {
        for(int i=0;i<hash.length;i++)

        {
            System.out.print(hash[i]);
        }
    }

    static int allChars(String s,char c)
    {

        int []hash=new int[256];

        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
           

        }

        printHash(hash);
        int output=hash[c];

       return output;
    }

    public static void main(String []args){

 //lowercase characters
        String s="abcdededeeret";

        int []hash=new int[26];

        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
           

        }


       int q=5;

       Scanner sc=new Scanner(System.in);

       //lowercase
    //    while(q-- >0)
    //    {
    //     System.out.print("enter character: ");
    //     char c=sc.next().charAt(0);

    //     System.out.println("no of occurance : "+hash[c-'a']);
    //    }


        // allCharacters


        while(q-- >0)
        {
         System.out.print("enter character: ");
         char c=sc.next().charAt(0);
 


         System.out.println("no of occurance : "+allChars(s, c));
        }



       sc.close();
        



    }
}
