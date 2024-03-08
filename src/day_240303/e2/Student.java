package day_240303.e2;
public class Student {
    String id;
    String name;
    int age;
    Dog[] dogs;

    // behavior
    public void show() {
        System.out.println("学生(学号" + id + ")的信息：学号=" + id + "、姓名=" + name + "、年龄=" + age);
        showDogs();
    }

    public void showDogs() {
        System.out.println("有" + dogs.length + "只狗狗：");
        for (Dog dog : dogs) {
            dog.show();
        }
    }
}