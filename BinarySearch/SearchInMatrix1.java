package BinarySearch;
import java.util.Arrays;
public class SearchInMatrix1 {
    
    public static void main(String[] args) {
        
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target=34;
        int m=matrix.length;
        int n=matrix[0].length;

        int sRow=0,endRow=m-1;

        while(sRow<=endRow)
        {
            int midRow=(sRow+endRow)/2;

            if(matrix[midRow][0]<=target&& target<=matrix[midRow][n-1])
            {
             System.out.println(Arrays.toString(searchRow(matrix, midRow, n, target)));
             break;
            }

            if(matrix[midRow][0]<target)
            {
                sRow=midRow+1;
            }
            else
            {
                endRow=midRow-1;
            }
        }


    }

    public static int[] searchRow(int[][] matrix,int row,int n,int target)
    {

        int sCol=0,endCol=n-1;

        while(sCol<=endCol)
        {
            int mid=(sCol+endCol)/2;

            if(matrix[row][mid]==target)
            {
                return new int[]{row,mid};
            }

            if(matrix[row][mid]<target)
            {
                sCol=mid+1;
            }
            else{
                endCol=mid-1;
            }

        }
        return new int[]{-1,-1};
    }


}
