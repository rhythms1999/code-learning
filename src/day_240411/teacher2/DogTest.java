package day_240411.teacher2;

public class DogTest {
    public static void main(String[] args) {
        // 变量类型 变量名 = 变量值;

        Dog dog1 = new Dog();
        dog1.name = "小白";
        dog1.type = "贵宾犬";
        System.out.println("一只狗：姓名：" + dog1.name + "，品种：" + dog1.type);


        // 变量类型 变量名 = 变量值;
        Dog[] dogs = new Dog[2];
        dogs[0] = dog1;

        Dog dog2 = new Dog();
        dog2.name = "小黑";
        dog2.type = "牧羊犬";

        dogs[1] = dog2;

    }
}
