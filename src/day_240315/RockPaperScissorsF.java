package day_240315;

import java.util.Scanner;

class Player {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}

class Game {
    private Player player;
    private Player computer;
    private String[] choices = {"rock", "paper", "scissors"};

    public Game(String playerName) {
        this.player = new Player(playerName);
        this.computer = new Player("Computer");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Enter your choice (rock, paper, or scissors):");

        String userChoice = scanner.nextLine().toLowerCase();
        if (isValidChoice(userChoice)) {
            player.setChoice(userChoice);

            int computerChoiceIndex = (int) (Math.random() * 3);
            computer.setChoice(choices[computerChoiceIndex]);

            System.out.println("Computer chose: " + computer.getChoice());
            System.out.println(player.getName() + " chose: " + player.getChoice());

            determineWinner();
        } else {
            System.out.println("Invalid input. Please enter 'rock', 'paper', or 'scissors'.");
        }

        scanner.close();
    }

    private boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private void determineWinner() {
        String userChoice = player.getChoice();
        String computerChoice = computer.getChoice();

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println(computer.getName() + " wins!");
        }
    }
}

public class RockPaperScissorsF {
    public static void main(String[] args) {
        Game game = new Game("Player");
        game.play();
    }
}
