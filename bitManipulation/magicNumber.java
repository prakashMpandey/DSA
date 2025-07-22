package bitManipulation;
import java.lang.Math.*;
public class magicNumber {
    
public static void main(String[] args) {
    
    double result=0;
    int n=4;
    int base=5;


    while(n>0)
    {
        int last=n & 1;
        n=n>>1;

        result+=last * base;

        base=base*5;
    }

    // for(int i=1;i<8;i++ )
    // {
    //     int mask=1<<i-1;

    //     if((n&mask)!=0)
    //     {
    //         magicNum+=Math.pow(5,i);
    //     }
    //     else{
    //         continue;
    //     }
        

    // }

    System.out.println(result);
   
}

}
