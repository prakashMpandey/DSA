package bitManipulation;

public class setIthBit {
    public static void main(String[] args) {
        
        int num=10;
        int n=3;

        
        int mask=1<<n-1;

        System.out.println(num|mask);

    
    }
}
