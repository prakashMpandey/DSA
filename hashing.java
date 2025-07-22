import java.util.Scanner;

public class hashing {
   
    public static void main(String[] args) {
        

        int n=9;
        int []arr={1,2,1,1,3,4,5,6,7};

        int [] hash=new int[10];

        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }

        //
        int q;
        Scanner sc=new Scanner(System.in);

        q=sc.nextInt();

        while (q-- >0)

        {try {
            
            System.out.println("enter the number");
            int number =sc.nextInt();

            System.out.println("no of times :"+hash[number]);
        } catch (Exception e) {
           
            System.out.println("exception occur");
        }
        }

        sc.close();

    }
}
