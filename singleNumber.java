public class singleNumber {
    

    public static void main(String args[])
    {

        int []arr={4,1,2,1,2};

        int singleNumber=arr[0];
        for(int i=1;i<arr.length;i++)
        {

            singleNumber=singleNumber^arr[i];

        }

        System.out.println(singleNumber);
    }
}
