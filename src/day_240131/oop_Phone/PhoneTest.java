package day_240131.oop_Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("锤子","黄");
        phone1.price = 3999;

        Phone phone2 = new Phone("香蕉","绿");
        phone2.color = "紫";
        phone2.price = 5666;
        phone2.brand = "梨子";

        phone1.call();
        phone2.tv("一人之下");
    }
}
