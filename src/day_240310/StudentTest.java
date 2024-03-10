package day_240310;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);

        // 要求是：“Student 类只能有一个实例对象”！该怎么做？
        // 思路
        //   1. 把构造器私有化 -> 问题 -> 外部不能 new -> 在哪里 new?
        //   2. 在类的内部 -> 内部哪里？
        //        - state -> Student student = new Student();
        //        - behavior
        Student student = new Student();
    }
}
