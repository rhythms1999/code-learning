package day_240315.Rps;

import java.util.Scanner;

public class Rps {

    //定义电脑选择的方法
    String getComputerChoice() {
        String ComputerChoice;
        int ComputerNumber = (int) (Math.random() * 3 + 1);

        if (ComputerNumber == 1) {
            ComputerChoice = "rock";
        } else if (ComputerNumber == 2) {
            ComputerChoice = "paper";
        } else {
            ComputerChoice = "scissor";
        }
        return ComputerChoice;
    }

    //定义用户选择的方法
    String getUserChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rock, paper or scissors:");
        String userInput = input.next().toLowerCase();
        return userInput;
    }


    //定义比较用户与电脑结果的方法
    //getresult中传递的是俩个形式参数，因此我加了i后缀
    String getResult(String ComputerChoicei, String userInputi) {
        if (ComputerChoicei.equals(userInputi)) {
            return "win";
        } else if (ComputerChoicei.equals("paper") && userInputi.equals("rock")) {
            return "win";
        } else if (ComputerChoicei.equals("rock") && userInputi.equals("scissors")) {
            return "win";
        } else if (ComputerChoicei.equals("scissors") && userInputi.equals("paper")) {
            return "win";
        } else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        Rps game = new Rps();
        String userInput;

        //在主程序中重新定义变量用来接收获取用户的输入
        //但是这里的userinput和上面getUserChioce中的userinput没有半点关系
        //同时这里可以循环判断是否输入了符合要求的内容
        while (true) {
            userInput = game.getUserChoice();
            if (userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors")) {
                break;
            }
        }
        //定义变量接收电脑的随机结果
        String computerChoice = game.getComputerChoice();

        //定义变量接收比较的结果
        String result = game.getResult(userInput, computerChoice);

        System.out.println("User Input: " + userInput);
        System.out.println("Computer Choice: " + computerChoice);
        System.out.println(result);
    }
}

