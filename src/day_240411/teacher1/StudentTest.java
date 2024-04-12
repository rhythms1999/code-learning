package day_240411.teacher1;

public class StudentTest {
    public static void main(String[] args) {


        String name = "名字";
        String[] names = new String[3];
        names[0] = name;
        String name2 = "名字2";
        names[1] = name2;


        System.out.println("=== === ===");

        // 一个学生
        Student student1 = new Student();
        student1.name = "小芳";
        student1.sex = '女';
        student1.hair = "辫子粗又长";
        student1.age = 18;
        System.out.println("学生1信息：" + student1.name + "，" + student1.sex + "，" + student1.hair + "，" + student1.age);


        // 存多个学生
        Student[] students = new Student[3];
        students[0] = student1;


        Student student2 = new Student();
        student2.name = "小胖";
        student2.sex = '男';
        student2.hair = "短发";
        student2.age = 20;

        System.out.println("学生2信息：" + student2.name + "，" + student2.sex + "，" + student2.hair + "，" + student2.age);


        students[0] = student2;




    }
}
