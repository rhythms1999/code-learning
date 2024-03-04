package day_240304;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.id = "002";
        stu1.name = "小黄";
        stu1.age = 18;

        Dog[] onedogs = new Dog[1];

        Dog puppy1 = new Dog();
        puppy1.id = "x-Fathion";
        puppy1.color = "黄";
        puppy1.name = "闪电";

        onedogs[0]  = puppy1;

        stu1.dogs = onedogs;

        stu1.show();

        //------------------

        Student stu2 = new Student();
        stu2.id = "007";
        stu2.name = "周深";
        stu2.age = 20;

        //用数组new出俩只新的周深的狗
        Dog[] twodogs = null;

        Dog puppy2 = new Dog();
        puppy2.id = "Z-light";
        puppy2.name = "软绵绵";
        puppy2.color = "白";

        Dog puppy3 = new Dog();
        puppy3.id = "T-bro";
        puppy3.name = "傻乎乎";
        puppy3.color = "黑";

        twodogs = new Dog[2];
        twodogs[0] = puppy2;
        twodogs[1] = puppy3;

        stu2.dogs = twodogs;

        stu2.show();

    }
}
