package day_240315.Rps;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        String[] game = new String[]{"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("石头剪刀布！（注意首字母大写）开始：");
        String input = scanner.next();

        int computernumber = getComputernumber(game);

        if (input.equals("Rock")) {
            if (computernumber == 1) {
                System.out.println("平局 0.0");
            } else if (computernumber == 2) {
                System.out.println("你输咯...");
            } else {
                System.out.println("你赢了！");
            }
        } else if (input.equals("Paper")) {
            if (computernumber == 1) {
                System.out.println("你赢了！");
            } else if (computernumber == 2) {
                System.out.println("平局 0.0");
            } else {
                System.out.println("你输咯...");
            }
        } else if (input.equals("Scissors")) {
            if (computernumber == 1) {
                System.out.println("你输咯...");
            } else if (computernumber == 2) {
                System.out.println("你赢了！");
            } else {
                System.out.println("平局 0.0");
            }
        } else {
            System.out.println("非法字符串！");
        }
    }

    private static int getComputernumber(String[] game) {
        Random computer = new Random();
        int computernumber = computer.nextInt(3) + 1;
        System.out.println("电脑出的是:");
        System.out.println(game[computernumber - 1]);
        return computernumber;
    }
}


