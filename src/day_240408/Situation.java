package day_240408;

import java.util.Scanner;

public class Situation {
    public static void main(String[] args) {
        System.out.println("情景1:");
        System.out.println("你老妈给你介绍对象...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入对方性别：");
        String sex = scanner.next().toLowerCase();

        System.out.println("输入对方的年纪:");
        int herAge = scanner.nextInt();

        if (sex.equals("woman") && herAge < 21) {
            System.out.println("可以考虑相亲...");
        }
        else {
            System.out.println("还是拜拜吧...");
        }
    }
}
