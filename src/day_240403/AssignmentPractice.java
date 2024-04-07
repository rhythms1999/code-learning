package day_240403;

public class AssignmentPractice {
    public static void main(String[] args) {
        short s = 3;
        //s = s + 2;
        // 会报错，因为在进行右边的 s + 2 运算时
        // 会先用 int 类型进行运算
        // 而左边的 s 定义为了 short 类型去承接故而会报错

        s+=2;
        // 不会报错，可以理解为这种形式的运算自带了强制类型转换

        int i =1;
        i *= 0.1;// 要先明确i的数据类型还是 int
        System.out.println(i);// 损失小数部分，故而结果为0
        i++;
        System.out.println(i);// 1

        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m = " + m);// 3
        System.out.println("n = " + n);// 6
    }
}
