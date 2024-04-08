package day_240408;

public class BreakContinueDemo {
    public static void main(String[] args) {

/*        // 打印1，2，3，4，5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }

        System.out.println(" ");*/

        // 跳过4
        // continue 是跳过本轮循环，如果后续满足条件则继续执行循环
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i);
        }

        System.out.println(" ");

        // 碰到4就停止打印
        // break 是跳出当前循环体（仅当前循环体），即包涵多重循环则只能跳出第一重
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i);
        }

        System.out.println(" ");

/*        // 多层循环，重复执行上一个循环3次
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                if (i == 4) {
                    break;
                }
                System.out.print(i);
            }
            System.out.print("\t");
        }

        System.out.println(" ");*/

        // 要求能跳到指定的循环
        // 给相应层数的循环命名，跳出指定的循环
        nameGiven:
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                if (i == 4) {
                    break nameGiven;
                }
                System.out.print(i);
            }
            System.out.print("\t");
        }
    }
}
