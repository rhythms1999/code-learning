package day_240223.oop_Round;

public class RoundTest {
    public static void main(String[] args) {

        Round round1area = new Round(2);
        System.out.println("面积："+round1area.area());

        Round round1perimeter = new Round(2);
        System.out.println("周长"+round1perimeter.perimeter());

    }
}
