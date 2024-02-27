package day240200_winter_holiday_homework;

import java.util.Arrays;

public class BubbleSort {
     public static void main(String[] args) {
         int[] arr = new int[]{28, 2, 5, 9, 11};
         int temp;

         for (int i = 0;i<arr.length-1;i++)
         {
             if (arr[i]>arr[i+1])
             {
                 temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
             }
         }
         System.out.println(Arrays.toString(arr));
     }
}
