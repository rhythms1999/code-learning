package day_240403;

public class TestASCII {
    public static void main(String[] args) {
        char a1 = 'a';
        int b = 10;
        char a2 = (char)(a1 + b);
        System.out.println(a2);

        //利用强转可以直接查看char类型数据所代表的ASCII码值
        char x = 'A';
        System.out.println((int)x);
    }
}
