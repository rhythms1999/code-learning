package day_240412;


public class TvTest {
    public static void main(String[] args) {

        Tv tv = new Tv();
        tv.brand = "格力";
        tv.room = "24X24";
        tv.price = 6399;

        System.out.println("电视品牌是"+ tv.brand+"，价值"+ tv.price+"，尺寸是"+ tv.room);
        tv.playtv();
    }
}
