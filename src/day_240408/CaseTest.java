package day_240408;

import java.util.Scanner;

public class CaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入月份:");
        int month = scanner.nextInt();

        int day = 0;
        switch(month){
            case 1,3,5,7,8,10,12:
                day=31;
                break;
            case 4,6,9,11:
                day=30;
                break;
            case 2:
                day=28;
                break;
            default:
                System.out.println("非法输入！");
                break;
        }
        System.out.println(day);
    }
}

