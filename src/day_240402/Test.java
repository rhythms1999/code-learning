package day_240402;

public class Test {
    public static void main(String[] args) {
        double price = 10000 - 200.3;
        double a = price / 450;
        double b = price % 450;
        double pay = 400*a + b;
        System.out.println(pay);
    }
}
