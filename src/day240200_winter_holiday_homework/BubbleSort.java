package day240200_winter_holiday_homework;

import java.util.Arrays;
/**
 * 排序算法
 *   将一串数组（一个列表）中的元素（整数，数字，字符串等）按某种顺序（增大，减小，字典顺序等）重新排列。
 * <a href="https://visualgo.net/zh/sorting?slide=1">sorting</a>
 */

public class BubbleSort {
     public static void main(String[] args) {
         int[] arr = new int[]{28, 5, 11, 2, 4};
         int temp;
         System.out.println("未经过排序的数组");
         System.out.println(Arrays.toString(arr));
         System.out.println("------------");

         for (int i = 0;i<arr.length-1;i++)
         {
             if (arr[i]>arr[i+1])
             {
                 temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
             }
         }
         System.out.println("经过一轮排序后的数组");
         System.out.println(Arrays.toString(arr));
         System.out.println("------------");

         for (int i = 0;i<arr.length-1-1;i++)
         {
             if (arr[i]>arr[i+1])
             {
                 temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
             }
         }
         System.out.println("经过二轮排序后的数组");
         System.out.println(Arrays.toString(arr));
         System.out.println("------------");

         for (int j = 0;j<arr.length-1;j++){
             for (int i = 0;i<arr.length-1-j;i++){
                 if (arr[i]>arr[i+1])
                 {
                     temp=arr[i];
                     arr[i]=arr[i+1];
                     arr[i+1]=temp;
                 }
             }
         }
         System.out.println("全体排完序后：");
         System.out.println(Arrays.toString(arr));
     }
}
