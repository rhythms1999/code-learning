package day_2024222;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.id = 003;
        dog1.color = "金";
        dog1.name = "小金毛";

        Dog dog2 = new Dog();
        dog2.id = 007;
        dog2.color = "灰白棕";
        dog2.name = "伯恩山";

        dog1.show();
    }

}
