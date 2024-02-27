package day_240200_winter_holiday_homework;

public class DisplayMyPhoneNumber {
    public static void main(String[] args) {

        int arr1[] = new int[]{0, 1, 2, 3, 5, 6, 8, 9};
        int arr2[] = new int[]{1, 3, 5, 6, 4, 4, 7, 0, 5, 3, 2};

        for (int i = 0; i<arr2.length;i++){
            System.out.print(arr1[arr2[i]]);
        }
    }
}
