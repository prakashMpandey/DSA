package recursion;

public class reverse {

      static int ans=0;

    public static void main(String[] args) {
        
      
        // rev(3210);
        // System.out.println(ans);

        // System.out.println(rev2(1234));

        System.out.println(palindrome(1221));
    }
    static void rev(int n)
    {
        if(n==0)
        {
            return ;
        }
        ans=(ans*10)+(n%10);
    
      rev(n/10);
    }

    static int rev2(int n)
    {
        int digits=(int)(Math.log10(n))+1;

        return helper(n, digits);
    }
    static int helper(int n,int digits)
    {

        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10, digits-1);
    }

    static boolean palindrome(int n)
    {
        return n==rev2(n);
    }

}
