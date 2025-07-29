package recursion;
public class fibo {
   
    public static void main(String[] args) {
        
        int number=fibonacci(5);

        System.out.println(number);

    }
    static int fibonacci(int n){

       
        if(n<2)
        {
            return n;
        }
        
         return fibonacci(n-1)+fibonacci(n-2);
        
    }
}
