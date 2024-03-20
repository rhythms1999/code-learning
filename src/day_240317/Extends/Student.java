package day_240317.Extends;

import day_240317.Extends.Persion;

public class Student extends Persion {
    int high;

    public void eat() {
        System.out.println("eat...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                "}";
    }

/*    @Override
    public void sleep() {
        System.out.println("Zzzzzzzz");
    }*/
}
