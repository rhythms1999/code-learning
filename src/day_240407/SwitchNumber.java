package day_240407;

public class SwitchNumber {
    public static void main(String[] args) {
        int x = 8;
        int y = 9;

        System.out.println("交换之前：");
        System.out.println(x);
        System.out.println(y);

        int t;

        t = x;
        x = y;
        y = t;

        System.out.println("交换之后：");
        System.out.println(x);
        System.out.println(y);

    }
}
