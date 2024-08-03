package Javacorecode.jdk8;

public class RecursiveFibonacci {
    public int fibonacci(int n){
        if(n<0){
            throw new IllegalArgumentException("Input parameter is invalid " + n);
        }

        if(n == 0){
            return 0;
        }

        else if(n <= 2){
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2); // head recursion
        }
    }

    public static void main(String[] args) {
        int nThfibonacciNo = new RecursiveFibonacci().fibonacci(5); //Ans 5
        System.out.println(nThfibonacciNo);
    }


}
