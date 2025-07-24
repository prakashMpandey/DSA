package bitManipulation;

public class noOfSetBits {
    public static void main(String[] args) {
        
        System.out.println(Integer.toBinaryString(10));
        System.out.println(setBits(10));
    }

    public static int setBits(int n)
    {
        int count=0;

        while(n>0)
        {
            count++;
            n=n & (n-1);
        }

        return count;
    }
}
