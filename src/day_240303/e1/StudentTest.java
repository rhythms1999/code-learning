package day_240303.e1;

import day_240303.e1.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 0001;
        s1.name = "小黄";
        s1.age = 21;

        Student s2 = new Student();
        s2.id = 0002;
        s2.name = "小王";
        s2.age = 22;

        s1.show();
        s2.show();
    }
}
