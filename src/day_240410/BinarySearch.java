package day_240410;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int flag = 0;
        boolean found = false;

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {

            int mid = (first + last) / 2;

            if (arr[mid] > flag) {
                last = mid - 1;
            } else if (arr[mid] < flag) {
                first = mid + 1;
            } else {
                System.out.println("找到了目标数字flag=" + flag + "它在第" + (mid + 1) + "个位置上");
                break;
            }
        }
        if (!found) {
            System.out.println("没找到flag：" + flag);
        }
    }
}
