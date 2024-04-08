package day_240408;

import java.util.Scanner;

public class Situation {
    public static void main(String[] args) {
        System.out.println("情景2:");
        System.out.println("你老妈给你介绍对象...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入对方财富：");
        int fortnue = scanner.nextInt();

        System.out.println("输入对方的年纪:");
        int herAge = scanner.nextInt();

        if (fortnue > 100000 || herAge < 30) {
            System.out.println("抓紧相亲...");
        } else {
            System.out.println("还是拜拜吧...");
        }
    }
}
