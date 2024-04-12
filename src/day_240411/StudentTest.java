package day_240411;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

/*        Student student1 = new Student();
        student1.name = "小芳";
        student1.sex = "女";
        student1.hairstyle = "辫子粗又长";
        student1.age = 18;*/
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[1];
        Dog[] dogs = new Dog[1];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            dogs[i] = new Dog();

            System.out.println("name=");
            String nameinput = scanner.next();
            students[i].name = nameinput;

            System.out.println("sex=");
            String sexinput = scanner.next();
            students[i].sex = sexinput;

            System.out.println("age=");
            int ageinput = scanner.nextInt();
            students[i].age = ageinput;

            System.out.println("hairstyle=");
            String hairstyleinput = scanner.next();
            students[i].hairstyle = hairstyleinput;

            System.out.println("--- --- --- --- --- --- ---");

            System.out.println("Dog's name =");
            String dogname = scanner.next();
            dogs[i].name = dogname;

            System.out.println("Dog's chop =");
            String dogchop = scanner.next();
            dogs[i].chop = dogchop;

        }
        students[0].thestudent();
        dogs[0].thedog();
    }
}
