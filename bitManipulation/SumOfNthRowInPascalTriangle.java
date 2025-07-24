package bitManipulation;

import java.util.Scanner;

public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {

        System.out.print("enter the row:");
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("sum of " +n+"th row:" + (1<<(n-1)));

        sc.close();
    }
}
