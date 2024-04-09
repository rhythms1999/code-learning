package day_240409;

public class PhoneNumber {
    public static void main(String[] args) {
        int arr1[] = new int[]{8, 2, 1, 0, 3};
        int arr2[] = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[arr2[i]]);
        }

        System.out.println(" ");

        int arr3[] = new int[]{3,0,5,2,1,8,6,9};
        int arr4[] = new int[]{4,0,6,5,2,2,7,1,6,0,3};

        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr3[arr4[j]]);
        }
    }
}
