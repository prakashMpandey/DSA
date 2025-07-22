package bitManipulation;

public class findUniqueElement2 {
    public static void main(String[] args) {
        
        int [] arr={1,1,10,1};

        int result=0,mask,sum;

        for(int i=0;i<32;i++)
        {
            sum=0;
            mask=1<<i;

            for(int j=0;j<arr.length;j++)
            {
                int opp=arr[j]&mask;
                if((opp)!=0)
                {
                    sum++;
                }


            }

            if(sum%3!=0)
            {

                result=result|mask;
            }
        }

    //todo :
     //  add the set bits
     //get the mod of every digit


    System.out.println(result);
    }
}
