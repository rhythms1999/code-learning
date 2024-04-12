package day_240412.beforetest;

public class StudentTest {
    public static void main(String[] args) {
        // 一个学生
        Student student1 = new Student();
        student1.name = "小芳";
        student1.sex = '女';
        student1.hair = "辫子粗又长";
        student1.age = 18;

        student1.show();

        // 狗1
        Dog dog1 = new Dog();
        dog1.name = "小白";
        dog1.type = "贵宾犬";

        // 狗2
        Dog dog2 = new Dog();
        dog2.name = "小黑";
        dog2.type = "牧羊犬";

        // 狗狗们
        Dog[] dogs = new Dog[2];
        dogs[0] = dog1;
        dogs[1] = dog2;

        student1.dogs = dogs;

        student1.show();

    }
}
