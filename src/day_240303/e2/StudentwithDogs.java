package day_240303.e2;

import day_24222.Dog;

public class StudentwithDogs {
    public int id;
    public String name;
    public int age;
    Dog[] dogs;
    public void show() {
        System.out.println("学生(" + name + ")的学号信息:" + id + "年龄：" + age);
    }
}