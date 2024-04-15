package day_240415;

import java.util.Arrays;

public class Student {
    int state;
    int score;
    int number;

    public void gradeShow() {
        System.out.print("学生" + number + "的成绩是：" + score + "\t");
    }

    public static void scoreRank(Student[] students) {
        for (int j = 0; j < students.length; j++) {
            System.out.println("学生" + students[j].number + "成绩：" + students[j].score + ",ta的年级是：" + students[j].state);
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[20];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
            students[i].number = i + 1;

            if (students[i].state == 2) {
                students[i].gradeShow();
            }
        }

        int t;
        for (int j = 1; j <= students.length - 1; j++) {
            for (int i = 0; i < students.length - j; i++) {
                if (students[i].score > students[i + 1].score) {
                    t = students[i].score;
                    students[i].score = students[i + 1].score;
                    students[i + 1].score = t;
                }
            }
        }

        scoreRank(students);
    }
}
