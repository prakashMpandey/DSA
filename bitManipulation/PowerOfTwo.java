package bitManipulation;

public class PowerOfTwo {
    
    public static void main(String[] args) {
        
        int n=25;


        if(n==0)
        {
            System.out.println("false");
        }
        if((n & (n-1)) ==0)
        {
            System.out.println("it is power of two");

        }
        else
        {
            System.out.println("it is not");
        }
    }
}
