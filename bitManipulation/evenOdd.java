package bitManipulation;

public class evenOdd {
    public static void main(String[] args) {
        
        int n=101;

        System.out.println(isEven(n));
    }

     static boolean isEven(int n)
     {
        return (n&1) ==0 ;
     }
}
