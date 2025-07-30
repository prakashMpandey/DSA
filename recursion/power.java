
package recursion;
public class power {
    

    public static void main(String[] args) {
        
        System.out.println(pow2(2,-200000000));
    }

    static double pow(double x,int n)
    {

        if(n==1)
        {
            return x;
        }
           return x*pow(x,n-1);
    }

    static double pow2(double x,int n )
    {
        if(n==0)
        {
            return 1;
        }

        return (1/x)*pow2(x,n+1);
    }
}

