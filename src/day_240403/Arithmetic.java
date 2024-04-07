package day_240403;

/**
 * Operators 1: The Arithmetic Operators
 * <p>
 * +	Additive operator (also used for String concatenation)
 * 加法运算符（也用于字符串连接、正）
 * <p>
 * -	Subtraction operator
 * 减法运算符（负）
 * <p>
 * *	Multiplication operator
 * 乘法运算符
 * <p>
 * /	Division operator
 * 除法运算符（求商）
 * <p>
 * %	Remainder operator
 * 求余/取模运算符
 * <p>
 * ++   Increment operator; increments a value by 1
 * operand++ (postfix)
 * ++operand (prefix)
 * <p>
 * --   Decrement operator; decrements a value by 1
 * operand-- (postfix)
 * --operand (prefix)
 */
public class Arithmetic {
    public static void main(String[] args) {
        // / 除法
        // a / b
        // 分析参与运算的各个参数类型
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        // 俩个 int 类型数据参与运算，求商结果为2
        System.out.println("result1 = " + result1);

        // a/b * b
        int result2 = num1 / num2 * num2;
        System.out.println("result2 = " + result2);
        // 在第一题的基础上乘以 num2 ，所以结果为10

        // double r = a / b
        double result3 = num1 / num2;
        System.out.println("result3 = " + result3);
        // 俩个 int 类型先参与计算为 2 ，结果用 double 类型来装，属于小转大，不会报错，结果为 double 类型的 2.0

        /*
        a / b + 0.0
         */
        double result4 = num1 / num2 + 0.0;
        System.out.println("result4 = " + result4);
        //  先产生 int 类型的 2 ，与 double 类型相加后为 2.0

        /*
        a / (b + 0.0)
         */
        double result5 = num1 / (num2 + 0.0);
        System.out.println("result5 = " + result5);
        // 相当于 12/5.0 ,最终结果 2.4

        /*
        (double)a / b
         */
        double result6 = (double) num1 / num2;
        System.out.println("result6 = " + result6);
        // 12.0/5 = 2.4

        /*
        (double)(a / b)
         */
        double result7 = (double) (num1 / num2);
        System.out.println("result7 = " + result7);
        // 用 double 类型来装装一个 int 类型的 2

        // === === ===

        // 被除数 除以 除数 = 商
        // 结果与被除数符号相同
        // % 求余/取模
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);
        // 2

        // 结果的符号与[***]的符号相同
        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 = " + m2 % n2);
        // -2

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 = " + m3 % n3);
        // 2

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = " + m4 % n4);
        // -2


        //(前)++ :increment, then calculate
        //(后)++ :calculate, then increment
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ",b1 = " + b1);

        // see: TestPlusPlus

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ",b2 = " + b2);

        int a3 = 10;
        ++a3;
        //a3++;
        int b3 = a3;

        // short
        short s1 = 10;
        //s1 = s1 + 1;
        //s1 = (short)(s1 + 1);
        /*
        ++/--，不会改变本身变量的数据类型
         */
        s1++;
        System.out.println(s1);

        // Q?
        byte bb1 = 127;
        //bb1++;
        //System.out.println("bb1 = " + bb1);

        //(前)-- :decrement, then calculate
        //(后)-- :calculate, the decrement
        int a4 = 10;
        int b4 = a4--;
        //int b4 = --a4;
        System.out.println("a4 = " + a4 + ",b4 = " + b4);
    }
}
