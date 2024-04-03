package day_240403;

public class VariableBasic {
    public static void main(String[] args) {
        // 数据类型 变量名 = 变量值;
        int count = 2;
        // 变量的使用
        System.out.println(count);

        // Cannot resolve symbol 'size'
        // System.out.println(size);

        //变量的声明
        int size;
        // Variable 'size' might not have been initialized
        // System.out.println(size);
        // 变量的赋值
        size = 1083;

        // Variable 'size' is already defined in the scope
        // 在同一个方法中重复的同名的变量
        // int size = 23;
    }

    public static void otherMethod() {
        // Cannot resolve symbol 'count'
        // 其他方法中所定义的 count 变量在当前方法中并不能生效
        // System.out.println(count);
    }
}
