package day_240317.Extends;

import day_240317.Extends.Persion;
import day_240317.Extends.Student;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();

        Persion persion = new Persion();


        System.out.println(student.getClass().getSuperclass());
        System.out.println(student.getClass());
        System.out.println(student);
        System.out.println(student.getClass().getSuperclass().getName());
    }
}
