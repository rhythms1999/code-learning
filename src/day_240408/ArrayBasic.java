package day_240408;

import java.util.Random;

public class ArrayBasic {
    public static void main(String[] args) {
        String[] name = new String[]{"张三","李四","王五","周八","吴六","郑九","蔡二"};

        Random random = new Random();
        int randomSelect = random.nextInt(7);

        System.out.println(name[randomSelect]);
    }
}
