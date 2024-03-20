package day_240315.AddtoHundred;

public class AddtoHundredMethodTwo {
    static int sum;
    int j = 1;

    public int getAddtoHundred(int i) {
        if (j <= i) {
            sum = sum + j++;
            getAddtoHundred(100);
        }
        return sum;
    }
    public static void main(String[] args) {
        AddtoHundredMethodTwo AddtoHunred = new AddtoHundredMethodTwo();
        AddtoHunred.getAddtoHundred(100);
        System.out.println(sum);
    }
}
