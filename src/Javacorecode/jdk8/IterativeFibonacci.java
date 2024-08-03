package Javacorecode.jdk8;

public class IterativeFibonacci {
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input parameter is invalid " + n);
        }

        int num1 = 0, num2 = 1;

        //zeroth fibonacci number is 0
        if (n == 0) {
            return 0;
        }

        //first and second fibonacci numbers are 1 and 1
        if (n == 1 || n == 2) {
            return 1;
        }

        int current = num1 + num2;

        //compute from the third number onwards by adding the previous fibonacci number
        for (int i = 3; i <= n; i++) {
            num1 = num2;
            num2 = current;
            current = num1 + num2;
        }

        return current;
    }

    public static void main(String[] args) {
        int nThfibonacciNo = new IterativeFibonacci().fibonacci(5); //Ans 5
        System.out.println(nThfibonacciNo);
    }
}
