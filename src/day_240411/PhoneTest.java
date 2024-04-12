package day_240411;

public class PhoneTest {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.brand = "iPhone15 proMax";
        phone.color = "黑色";
        phone.price = 4399;

        System.out.println("手机品牌是"+ phone.brand+"，价值"+ phone.price+"，颜色是"+ phone.color);
        phone.playgame();
    }
}
