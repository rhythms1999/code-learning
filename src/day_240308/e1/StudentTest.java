package day_240308.e1;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        // 20
        Student[] students = new Student[20];
        for (int i = 1; i <= 20; i++) {
            Student student = new Student();
            student.number = i;
            student.state = (int)(Math.random() * 6 + 1);
            student.score = (int)(Math.random() * 101);

            students[i-1] = student;
        }

        // 问题一


        for (Student student : students) {
            if (student.state == 3) {
                System.out.println(student);
            }
        }

        System.out.println("=== === ===");

        // 问题二
        // ref: BubbleSort
        System.out.println("排序之前：" + Arrays.toString(students));

        for (int i = 0; i < students.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (students.length - 1) - i; j++) {
                if (students[j].score > students[j+1].score) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                    //System.out.println("进行了一次交换的动作：" + Arrays.toString(students));
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            //System.out.println("=== === ===");
        }

        System.out.println("排序之后：" + Arrays.toString(students));
    }
}