package day240200_winter_holiday_homework;

public class Table99 {
    public static void main(String[] args) {
        for(int i =1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"x"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
