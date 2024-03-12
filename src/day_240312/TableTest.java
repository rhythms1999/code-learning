package day_240312;

public class TableTest {
    public static void main(String[] args) {
        Table desk1 = Table.getDeskinstance();
        System.out.println(desk1);

        Table desk2 = Table.getDeskinstance();
        System.out.println(desk2);
    }
}
