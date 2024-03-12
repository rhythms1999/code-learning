package day_240308.thiskeyword;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("-------");

        Student student2 = new Student(2);
        System.out.println("-------");

        Student student3 = new Student(3, "Alice");
        System.out.println("-------");

        Student student4 = new Student(1, "John", 18);
    }
}
