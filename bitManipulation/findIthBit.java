package bitManipulation;

public class findIthBit {
    public static void main(String[] args) {
        
        int num=10;
        int bitPosition=3;
        int mask=1 << (bitPosition-1);
      
        int ans=num & mask;
         if ((ans) == 0) {
            System.out.println("The " + bitPosition + "th bit is 0");
        } else {
            System.out.println("The " + bitPosition + "th bit is 1");
        }



    }
}
