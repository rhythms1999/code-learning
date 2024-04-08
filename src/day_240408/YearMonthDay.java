package day_240408;

import java.util.Scanner;

public class YearMonthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("请先输入年份:");
        int year = scanner.nextInt();
        System.out.println("输入月份:");
        int month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("这个月有31天");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("这个月有30天");
        } else if (month == 2 && ( (year % 4 == 0 && !(year % 100 != 0)) || year % 400 == 0) ) {
            System.out.println("这个月有29天");
        } else if ((month == 2 && year % 4 != 0)) {
            System.out.println("这个月有28天");
        } else {
            System.out.println("非法输入！");
        }
    }
}
