package maths;

public class binarySqrt {
    
    public static void main(String[] args) {
        
        System.out.println(NewtonRaphson(40));
    }

    static double NewtonRaphson(int n)
    {
        double root=0;
        double x=n;

        while(true)
        {

            root=0.5*(x+(n/x));

            if(Math.abs(root-x) < 0.1)
            {
                break;
            }

            x=root;
        }

        return root;
    }

    static double BinarySqrt(int n)
    {
        int s=0;
        int e=n;
        int p=3;
        double root=0.0;

        while(s<=e)
        {
            int m=s+(e-s)/2;

            if(m*m==n)
            {
                return m;
            }

            if(m*m>n)
            {
                e=m-1;
            }
            else
            {
                      root=m;

                s=m+1;
            }
        }

  
        double incr=0.1;

        for(int i=0;i<p;i++ )
        {
           while(root*root<=n)
           {
            root+=incr;
           }

           root-=incr;
           incr/=10;
        }

        return root;

    }
}
