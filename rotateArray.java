public class rotateArray {
    
    public static void main(String[] args) {
        
        int []nums={1,2,3,4,5,6,7};
    
        int n=nums.length;
        int k=3;

        //righht rotation

        // reverse(nums,0,n-1);
        // reverse(nums,0,k-1);
        // reverse(nums,k,n-1);

        // leftRotate(nums, n, k);

        reverse(nums,0, n-1);
        reverse(nums,0,n-k-1);
        reverse(nums, n-k, n-1);
        
        display(nums, n);


       
        
    }

    static void reverse(int []arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    static void leftRotate(int []arr,int n,int k)


    {

        int res[]=new int[n];
        for(int  i=0;i<n;i++)
        {
            res[(i-k+n)%n]=arr[i];

            
        }

        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
    }

    static void display(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
