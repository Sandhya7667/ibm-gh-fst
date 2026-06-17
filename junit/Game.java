package Rps;

import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

import java.io.*;

class RockPaperScissors {

    private final List<String> choices = Arrays.asList("rock", "paper", "scissors");
    private int playerScore = 0;
    private int computerScore = 0;
    private final String resultFile = "game_results.txt";
    private Scanner scanner = new Scanner(System.in);

    
    public String getPlayerChoice() {
        while (true) {
            try {
                System.out.print("Enter rock, paper, or scissors: ");
                String choice = scanner.nextLine().toLowerCase();

                if (!choices.contains(choice)) {
                    throw new IllegalArgumentException("Invalid choice!");
                }
                return choice;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " Try again.");
            }
        }
    }

    
    public String getComputerChoice() {
        Random rand = new Random();
        return choices.get(rand.nextInt(choices.size()));
    }

    
    public String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "tie";
        } else if (
                (player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))
        ) {
            return "player";
        } else {
            return "computer";
        }
    }

    
    public void saveResult(String player, String computer, String winner) {
        try (FileWriter writer = new FileWriter(resultFile, true)) {
            writer.write("Player: " + player +
                    ", Computer: " + computer +
                    ", Winner: " + winner + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

   
    public void playRound() {
        String playerChoice = getPlayerChoice();
        String computerChoice = getComputerChoice();

        System.out.println("\nYou chose: " + playerChoice);
        System.out.println("Computer chose: " + computerChoice);

        String winner = determineWinner(playerChoice, computerChoice);

        if (winner.equals("player")) {
            System.out.println("You win this round!");
            playerScore++;
        } else if (winner.equals("computer")) {
            System.out.println("Computer wins this round!");
            computerScore++;
        } else {
            System.out.println("It's a tie!");
        }

        System.out.println("Score -> You: " + playerScore +
                " | Computer: " + computerScore);

        
        saveResult(playerChoice, computerChoice, winner);
    }

   
    public void playGame() {
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            playRound();

            try {
                System.out.print("\nPlay again? (y/n): ");
                String again = scanner.nextLine().toLowerCase();

                if (!again.equals("y") && !again.equals("n")) {
                    throw new IllegalArgumentException("Enter 'y' or 'n' only.");
                }

                if (again.equals("n")) {
                    System.out.println("Thanks for playing!");
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}


public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockPaperScissors game = new RockPaperScissors();
        game.playGame();

	}
}
