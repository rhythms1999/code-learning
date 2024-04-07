package day_240407;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int AimNumber = randomNumber.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("0~100输入你心中的答案：");

        while (true){
            int GuessNumber = scanner.nextInt();

            if (AimNumber == GuessNumber) {
                System.out.println("Yes！");
                break;
            } else if (AimNumber < GuessNumber) {
                System.out.println("猜得太大咯！");
            } else {
                System.out.println("小了呀。。。");
            }

            System.out.println("再猜一次吧：");
        }
    }
}
