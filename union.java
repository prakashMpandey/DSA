import java.util.ArrayList;

public class union {
    
    public static void main(String []args)
    {

        int arr[]={1,2,3,4,5};
        int brr[]={5,6,7,7,8,9};

        int i=0,j=0;
        int m=arr.length;
        int n=arr.length;
         ArrayList<Integer> ans=new ArrayList<>();

         while(i<m && j<n)
         {
            if(arr[i]<brr[j])
            {
                if(i>0&&ans.getLast()==arr[i])
                {
                    i++;
                    continue;
                }

                ans.add(arr[i]);
                i++;
            }

           else if(arr[i]==brr[j])
            {

                ans.add(arr[i]);
                i++;
                j++;
            }
            else {

                if(j>0&&ans.getLast()==brr[j])
                {
                    j++;
                    continue;
                }
                ans.add(brr[j]);
                j++;
            }
         }


         if(i<m){

            while(i<=m)
            {
                if(ans.getLast()==arr[i])
                {
                    i++;
                    continue;
                }
                ans.add(arr[i]);
                i++;
            }
         }

         if(j<n)
         {
            while(j<=n)
            {
                if(ans.getLast()==brr[j])
                {
                    j++;
                    continue;
                }
                {

                }
                ans.add(brr[j]);
                j++;
            }
         }

          

         for(int key=0;key<ans.size();key++)
         {
            System.out.print(ans.get(key)+" ");

         }

    }
}
