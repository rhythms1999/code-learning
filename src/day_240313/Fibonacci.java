package day_240313;

public class Fibonacci {

    public int getFibonacci(int i) {
        if (i == 0) {
            return 1;
        } else if (i == 1) {
            return 1;
        } else {
            return getFibonacci(i - 1) + getFibonacci(i - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci calculate = new Fibonacci();
        int result = calculate.getFibonacci(3);
        System.out.println(result);
        System.out.println(calculate.getFibonacci(5));

    }
}
