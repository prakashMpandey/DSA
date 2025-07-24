package bitManipulation;

public class xorUptoA {
    
    public static void main(String[] args) {
        

        int n=5;

        if(n%4==0){
            System.out.println(n);
        }
        else if(n%4==1){
            System.out.println(1);
        }
        else if(n%4==2)
        {
            System.out.println(n+1);
        }
        if(n%4==3)
        {
            System.out.println(0);
        }
    }
}
