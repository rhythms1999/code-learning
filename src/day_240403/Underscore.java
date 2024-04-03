package day_240403;
/**
 * Using Underscore Characters in Numeric Literals
 * 在数字字面量中使用下划线字符
 *
 *
 * In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal.
 *   This feature enables you, for example:
 *     to separate groups of digits in numeric literals, which can improve the readability of your code.
 * 在 Java SE 7 及更高版本中，任意数量的下划线字符(_)可以出现在数字字面量中数字之间的任意位置。
 *   此功能使您能够，例如：
 *     以分隔数字字面量中的数字组，这可以提高代码的可读性。
 *
 *
 * For instance, if your code contains numbers with many digits,
 *   you can use an underscore character to separate digits in groups of three,
 *     similar to how you would use a punctuation mark like a comma, or a space, as a separator.
 * 例如，如果代码包含许多数组成的数值，
 *   则可以使用下划线字符将数字分隔为三组，
 *     类似于使用逗号或空格等标点符号作为分隔符。
 *
 */
public class Underscore {
    public static void main(String[] args) {
        // 为了增加对很长数字的可读性，在 JDK7 中就已经添加了数字变量中加入下划线并不会数据本身
        // 虚拟机会忽略下划线只读取数据本身
        int meetingNumber = 234_343_565;

        // 但是下划线的使用需要注意三条规则：不能出现在以下位置
        // 1.数字的开头或结尾
        // 2.与小数点相邻
        // 3.与 f 或 F 相邻

        // float pi1 = 3._23124F;
        // float pi2 = _3.2_3124F;
        // float pi3 = 3.23124_F;
        // float pi4 = 3.2_3124F;
    }
}
