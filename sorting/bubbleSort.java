package sorting;
import java.util.Arrays;
class bubbleSort{

    public static void main(String[] args) {
        
        int []arr={6,5,4,3,2,1};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr)
    {

        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 &&arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }

   static void selectionSort(int[] arr)
    {

        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int smallestIndex=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[smallestIndex])
                {
                    smallestIndex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[smallestIndex];
            arr[smallestIndex]=temp;
        }
    }

   public static void Bubblesort(int[] arr)
   {

    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        boolean swapped=false;
        for(int j=1;j<n;j++)
        {
            if(arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;      
                
            swapped=true;    
            }

        }

        if(!swapped)
        {
            break;
        }
    }
   }
}