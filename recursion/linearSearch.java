package recursion;

import java.util.ArrayList;

public class linearSearch {
    
    public static void main(String[] args) {
        
        int []arr={2,3,10,5,10,10,55};

        // System.out.println(search(0, 1, arr));

        // search2(0,11,arr);

        // System.out.println(ans);

        System.out.println(search4(arr,10,0));

    }

    static int search(int index,int target,int[] arr)
    {

        if(index>arr.length-1) return -1;
        if(arr[index]==target)
        {
            return index;
        }

        return search(index+1,target,arr);
        
    }

    static ArrayList<Integer> ans=new ArrayList<>();

    static void search2(int index,int target,int[] arr)
    {
        if(index==arr.length)
        {
            return ;
        }
        if(arr[index]==target)
        {
            ans.add(index);
        }

        search2(index+1, target, arr);

    }



static ArrayList<Integer> search3(int[] arr,int target,int index,ArrayList<Integer> ans)
{
    if(index==arr.length) return ans;

    if(arr[index]==target)
    {
        ans.add(index);
    }

    return search3(arr, target, index+1, ans);

}



static ArrayList<Integer> search4(int[] arr,int target,int index)
{

    ArrayList<Integer> ans=new ArrayList<>();

    if(index==arr.length) return ans;

    if(arr[index]==target)
    {
        ans.add(index);
    }

    ArrayList<Integer>ansFromBelow=search4(arr, target, index+1);

    ans.addAll(ansFromBelow);

    return ans;

}

}

