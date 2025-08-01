package recursion;

public class rotatedBinarySearch {
    
    public static void main(String[] args) {
        

        int[] arr={10,20,30,5,4,2};

       System.out.println(search(arr,5,0,arr.length-1)); 
    }

    static int search(int []arr,int target,int start,int end)
    {

        if(start>end)
        {
            return -1;
        }

        int mid=start+(end-start)/2;

        if(arr[mid]==target)
        {
            return mid;
        }

       if(arr[start]<=arr[mid])
       {
         if(arr[start]<=target && target <=arr[mid])
        {
            return search(arr, target, start, mid-1);
        }
        else{
            
            return search(arr, target, mid+1, end);
        }
       }

       if(target>=arr[mid] && target<=arr[end])
       {
        return search(arr, target, mid+1, end);

       }

       return search(arr,target,start,mid-1);

    }
}
