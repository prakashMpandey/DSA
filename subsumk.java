public class subsumk {
    public static void main(String[] args) {
        
        int []nums={1,-1,0};
        int k=3;
        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++)
        {

            if(nums[i]==k)
            {
                count++;
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(sumFinder(nums,i,j,k))
                {
                    count++;
                }

            }
        }

        System.out.println("count="+count);

    }
    

     static public boolean sumFinder(int []arr,int start,int end,int k)
    {
        int sum=0;

        for(int i=start;i<=end;i++)
        {
            sum+=arr[i];

            
        }

        if(sum==k)
        {
            return true;
        }
        return false;
    }

}
