package day_240412.beforetest;

public class Student {
    String name;
    char sex;
    String hair;
    int age;

    Dog[] dogs;

    public void show(){


        System.out.println("学生1基础信息：" + name + "，" + sex + "，" + hair + "，" + age+ "，" + dogs);

        System.out.println("=== === ===");
        if (dogs==null){
            System.out.println("没有狗子信息...");
        }
        else {
            System.out.println("学生1的狗狗们：");
            for (int i = 0; i < dogs.length; i++) {
                System.out.println("第" + (i+1) + "只狗的姓名：" + dogs[i].name + ", 品种：" + dogs[i].type);
            }
        }
    }
    }




