package day_240407;

public class Loop {
    public static void main(String[] args) {
        // for
        // 明确的循环次数
        for (int i = 1; i <= 3; i++) {
            System.out.println("Java");
        }

        System.out.println("--- --- ---");

        // while
        // 当不清楚具体的循环次数时，使用一个判断条件, 只要达到条件即可结束循环
        int j = 1;
        while(j <= 3){
            System.out.println("Java");
            j++;
        }

        System.out.println("--- --- ---");

        // do~while
        // 无论循环条件都会先执行一遍循环, 也适用于循环次数不清晰的情况
        int k = 1;
        do {
            System.out.println("Java");
            k++;
        }
        while (k <= 3);
    }
}
