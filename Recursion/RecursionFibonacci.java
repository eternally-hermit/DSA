package Recursion;


public class RecursionFibonacci {

    static int fibN(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibN(n-1) + fibN(n-2);

    }

    public static void main(String[] args) {
        int fib = fibN(10);
        System.out.println(fib);
    }
    
}
