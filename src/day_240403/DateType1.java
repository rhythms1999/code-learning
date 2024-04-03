package day_240403;

public class DateType1 {
    public static void main(String[] args) {
        // Literals 字面量

        byte from = 12;
        byte to = -128;
        // byte : -128 ~ 127
        // to = 128;

        short size = 128;
        int com = 2314141;
        // 打开会不会报错？为什么？在数据范围之内
        // long big = 121442415124;
        // 在Java中，整形数据在 Literals 字面量上会被默认成为int类型
        // 所以需要在结尾加上标识符号
        long big = 121442415124L;
        //l和L都可以，但推荐L

        // float 和 double 同理，默认double
        double doubleVar = 123.4;
        //float floatVar = 23.5;
        float floatVar = 23.5f;

        char c1 = 'a';
        // 需要单个字符
        // c1 = 'AB';

        char c2 = '4';
        char c3 = '还';
        char c4 = 'Q';

        // 转义字符
        char c5 = '\n';
        // 制表符
        char c6 = '\t';
        // Unicode
        char c7 = '\u2233';
        System.out.println(c7);

        // boolean 常用于条件判断
        boolean flag = true;

    }
}
