package day240200_winter_holiday_homework;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

    int arr[] = new int[]{3,4,5,6,7,8,9};
    //有序数组的前提下索引到要找的数字
    int first = 0;
    int last = arr.length-1;
    int mid = (first+last)/2;
    Scanner scan = new Scanner(System.in);
    System.out.println("输入你要搜寻的数字");
    int flag = scan.nextInt();

    boolean NotFound = true;

    while(first<=last){
            if (arr[mid]==flag){
                NotFound = false;
                System.out.println("找到了你要的数字"+arr[mid]+"，它在第"+(mid+1)+"个");
                break;
            }
            else if(arr[mid]<flag){
                first = mid + 1;
                mid = (first+last)/2;
            }
            else if (arr[mid]>flag) {
                last = mid - 1;
                mid = (first+last)/2;
            }
    }
    if (NotFound){
        System.out.println("没有该数字");
    }
}
}
