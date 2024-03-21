package day_240303.e3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 1; i <= 20; i++) {
            Student student = new Student();
            student.state = (int) (Math.random() * 6 + 1);
            student.score = (int) (Math.random() * 101);
            student.number = i;

            students[i - 1] = student;
        }

        int temp;

        for (int j = 0; j < students.length - 1; j++) {
            for (int i = 0; i < students.length - 1 - j; i++) {
                if (students[i].score > students[i + 1].score) {
                    temp = students[i].score;
                    students[i] = students[i + 1];
                    students[i + 1].score = temp;
                }
            }
        }
        System.out.println("全体排完序后：");
        System.out.println(Arrays.toString(students));
    }

}