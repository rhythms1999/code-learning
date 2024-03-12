package day_240308;
/**
 * 练习：可变形参的方法
 * <p>
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割-=，如果没有传入字符串，那么返回空字符串""
 */
public class Homework {

    public static void main(String[] args) {
        // 例，输入参数：hello world !

        // 支持如下形式的输出
        // hello-world-!
        // hello,world,!
        // hello=world=!

        concat("-", "hello", "world", "!");
        concat(",", "hello", "world", "!");
        concat("=", "hello", "world", "!");
        concat(".");
    }

    public static void concat(String connector, String... words) {
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                result += words[i];
            } else {
                result += (connector + words[i]);
            }
        }

        System.out.println(result);
    }
}

