package day_240131.oop_Phone;

public class Phone {
    //state
    String color;
    String brand;
    int price;

    public Phone(String brand,String color){
        this.brand = brand;
        this.color = color;
    }

    //behavior
        void call(){
            System.out.println("这是"+color+"色的"+brand+"手机，"+"价值"+price);
        }

        void tv(String tvName){
            System.out.println("我正在使用"+brand+"牌手机看"+tvName);
        }
}
