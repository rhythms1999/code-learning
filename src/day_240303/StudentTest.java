package day_240303;

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

        System.out.println(s1.name+":"+s1.age+"岁\t学号:"+s1.id);
        System.out.println(s2.name+":"+s2.age+"岁\t学号:"+s2.id);
    }
}
