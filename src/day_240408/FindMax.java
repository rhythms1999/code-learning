package day_240408;

public class FindMax {
    public static void main(String[] args) {
        int x = 8 , y = 9;
        int max;
        if (x >= y){
            max = x;
        }
        else {
            max = y;
        }
        System.out.println(max);
        System.out.println(x >= y ? x : y);
    }
}
