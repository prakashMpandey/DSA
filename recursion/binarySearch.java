package recursion;

public class binarySearch {
   
    public static void main(String[] args) {
        
        int []arr={10,30,40,50,60,70,99};

        System.out.println(search(arr, 00, 0, arr.length-1));

    }
    public static  int search(int []arr,int target,int start,int end)
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

        if(arr[mid]>target)
        {
            return search(arr,target,start,mid-1);
        }
        else{
            return search(arr,target,mid+1,end);
        }

    }
}
