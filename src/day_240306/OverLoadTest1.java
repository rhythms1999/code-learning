package day_240306;

public class OverLoadTest1 {
    public static int sum(int a,int b) {
        return a+b;
    }
    public static double sum(double a,double b) {
        return a+b;
    }

    public  static char add(char a,char b){
        return (char)(a+b);
    }

    public static int add(int arr[]){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
    }
}
