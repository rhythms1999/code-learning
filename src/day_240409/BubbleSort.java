package day_240409;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{28, 5, 11, 9, 2, 45, 23, 78};
        int t;

        for (int j = 1; j <= arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                // 每轮都找出该轮次下最大的一个数字将其排到最后，比如第一轮是78，第二轮就是45
                if (arr[i] > arr[i + 1]) {
                    t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
