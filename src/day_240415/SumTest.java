package day_240415;

public class SumTest {
    public static void main(String[] args) {
        Sum sum1 = new Sum();

        System.out.println(sum1.sum(1, 2));

        System.out.println(sum1.sum(1L, 2L));

        System.out.println(sum1.sum(1.0F,2.0F));

        System.out.println(sum1.sum(1.0, 2.0));
    }
}
