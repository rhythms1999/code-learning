package day_240407;

public class Table99Details {
    public static void main(String[] args) {
        // step 1: 打印最基础的 1x1=1 九遍
/*         for (int i = 1; i <= 9; i++) {
                System.out.println("1 * 1 = 1");
        }*/

        // step 2: 已经有列，需要增添行
/*          for (int i = 1; i <= 9; i++) {
                System.out.print("1 * 1 = 1 ");
                System.out.print("1 * 1 = 1 ");
                System.out.print("1 * 1 = 1 ");
                System.out.print("1 * 1 = 1 ");
                System.out.println("。。。");
        }*/

        // step 3: 行也是不断地循环罢了，所以我们可以理所应当的再添加一个内循环
/*          for (int i = 1; i <= 9; i++) {
                for (int j = 1 ; j <=9 ; j++){
                    System.out.print("1 * 1 = 1");
                    }
                    System.out.println();// 增添换行操作让每打印九个 "1 * 1 = 1" 就执行一次换行
        }*/

        // step 4: 将数字和 i 、 j 联系起来，让每一行有动态的变化
/*          for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print(i + "*" + j + "=" + i * j);
                    }
                    System.out.println();
        }*/

        // step 5: 增加细节优化 \t 保持间距
/*          for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print(i + "*" + j + "=" + i * j + "\t");
                    }
                    System.out.println();
        }*/

        // step 6: 修改内层循环条件，除去冗余
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
