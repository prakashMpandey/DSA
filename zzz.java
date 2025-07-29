import java.util.Scanner;

public class zzz {
    
    public static void main(String[] args) {
      
    System.out.println(gcd(4,2));
    }

    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,b);
    }
}
