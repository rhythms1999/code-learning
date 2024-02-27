package day_240200_winter_holiday_homework;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{34,5,76,14,86,45,30,9};
        boolean Found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要寻找的整数");
        int flag = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if (arr[i]==flag){
                System.out.println("找到了");
                Found = true;
                break;
            }
        }
        if (!Found){
            System.out.println("没有该数字");
        }
    }
}
