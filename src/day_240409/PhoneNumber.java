package day_240409;

public class PhoneNumber {
    public static void main(String[] args) {
        int arr1[] = new int[]{8, 2, 1, 0, 3};
        int arr2[] = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        for (int i = 0; i <= arr2.length; i++) {
            // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
            //	at day_240409.PhoneNumber.main(PhoneNumber.java:9) 数组下标越界错误
            System.out.print(arr1[arr2[i]]);
        }
    }
}
