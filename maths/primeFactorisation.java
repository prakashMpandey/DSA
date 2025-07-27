package maths;
import java.util.ArrayList;

public class primeFactorisation {
   
    public static void main(String[] args) {
        int []arr={2,4,6,9,20,100};

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        for(int val:arr)
        {
            ans.add(calculateFactors(val));
        }

        System.out.println(ans);
    }

    public static ArrayList<Integer> calculateFactors(int n)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(n<=2)
        {
           ans.add(n);
           return ans;
        }
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                ans.add(i);
                n/=i;
            }
        }
        
            if(n>1)
            {
                ans.add(n);
            }
        return ans;

    }
}
