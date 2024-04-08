package day_240408;

import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查询相应月份的天数");
        int Month = scanner.nextInt();
        if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
            System.out.println("这个月有31天");
        } else if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
            System.out.println("这个月有30天");
        } else if (Month == 2) {
            System.out.println("这个月有28天");
        } else {
            System.out.println("非法输入！");
        }
    }
}
