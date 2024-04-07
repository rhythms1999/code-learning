package day_240403;

public class ArithmeticPractice {
    public static void main(String[] args) {
        int a = 18;
        int b = 28;
        int i = a++;

        System.out.print("i =" + i + "\t");
        System.out.print("a =" + a + "\t");
        System.out.println("b =" + b);

        i = ++a;
        System.out.print("i =" + i + "\t");
        System.out.print("a =" + a + "\t");
        System.out.println("b =" + b);

        i = b--;
        System.out.print("i =" + i + "\t");
        System.out.print("a =" + a + "\t");
        System.out.println("b =" + b);

        i = --b;
        System.out.print("i =" + i + "\t");
        System.out.print("a =" + a + "\t");
        System.out.println("b =" + b);
    }
}
