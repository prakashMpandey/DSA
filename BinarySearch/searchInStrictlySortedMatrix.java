package BinarySearch;
import java.util.Arrays;
public class searchInStrictlySortedMatrix {
    public static void main(String[] args) {
        
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(Arrays.toString(search(arr,5)));
    }

    static int[] search(int[][] matrix,int target)
    {

        int rows=matrix.length;
        int cols=matrix[0].length;

        if(rows==1)
    {
        return binary(matrix, target, 0, 0, cols-1);
    }

    int rstart=0;
    int rend=rows-1;

    int cmid=cols/2;

    while(rstart<(rend-1))
    {
        int mid=(rstart+rend)/2;

        if(matrix[mid][cmid]==target)
        {
            return new int[]{mid,cmid};
        }
        if(matrix[mid][cmid]<target)
        {
            rstart=mid;
        }
        else{
            rend=mid;
        }


    }

    if(matrix[rstart][cmid]==target)
    {
        return new int[]{rstart,cmid};
    }

    if(matrix[rstart+1][cmid]==target)
    {
        return new int[]{rstart+1,cmid};
    }

    if(target<=matrix[rstart][cmid-1])
    {
        return binary(matrix, target, rstart, 0, cmid-1);
        
    }
    if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][cols-1])
    {
    return binary(matrix, target, rstart, cmid+1, cols-1);
    }


    if(target<=matrix[rstart+1][cmid-1])
    {
        return binary(matrix, target, rstart+1, 0, cmid-1);

    }
   else
   {
    return binary(matrix, target, rstart+1, cmid+1, cols-1);
   }
        
       
    }

    static int[] binary(int[][] matrix,int target,int row,int cStart,int cEnd)
    {
       while(cStart<=cEnd)
       {
        int mid=cStart+(cEnd-cStart)/2;

        if(matrix[row][mid]==target)
        {
           
            return new int[]{row,mid};
        }

        if(matrix[row][mid]<target)
        {
            cStart=mid+1;
        }
        else{
            cEnd=mid-1;
        }
       } 

       return new int[]{-1,-1};
    }
}
