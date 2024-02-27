package day240200_winter_holiday_homework;

import java.util.Arrays;

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
