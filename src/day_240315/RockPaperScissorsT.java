package day_240315;

import java.util.Scanner;

public class RockPaperScissorsT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Enter your choice (rock, paper, or scissors):");

        String userChoice = scanner.nextLine().toLowerCase();

        if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            String[] choices = {"rock", "paper", "scissors"};
            int computerChoiceIndex = (int) (Math.random() * 3);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("You chose: " + userChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println("Invalid input. Please enter 'rock', 'paper', or 'scissors'.");
        }

        scanner.close();
    }
}

