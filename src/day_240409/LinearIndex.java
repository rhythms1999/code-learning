package day_240409;

public class LinearIndex {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("找到了目标数字:" + target + ",它处于第" + (i + 1) + "个 位置");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("没有找到哦");
        }
    }
}
