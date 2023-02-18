import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Declaring Variables
        String player1 ="";
        String player2 ="";
        String trash ="";
        String restart ="Y";
        Scanner in = new Scanner(System.in);
        do {
            //Prompt Instructions
            System.out.println("Welcome to Rock Paper Scissors! Please select either Rock, Paper, or Scissors and enter either R, P, or S respectively.");
            //Prompt For P1
            System.out.println("Player 1 please enter your move: ");
            //Input For P1
            System.out.print("");
            player1 = in.nextLine();
            //Prompt For P2
            System.out.println("Player 2 please enter your move: ");
            //Input For P2
            System.out.print("");
            player2 = in.nextLine();
            //Output For P1 "R"
            if (player1.equalsIgnoreCase("R"))
            {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("This is an invalid input, please restart and try again.");
                }
            }
            //Output For P1 "P"
            else if (player1.equalsIgnoreCase("P"))
            {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Player 1 wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 wins!");
                } else {
                    System.out.println("This is an invalid input, please restart and try again.");
                }
            }
            //Output For P1 "S"
            else if (player1.equalsIgnoreCase("S"))
            {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Player 2 wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Player 1 wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("This is an invalid input, please restart and try again.");
                }
            }
            else
                System.out.println("This is an invalid input, please restart and try again.");
            //Output If Invalid
            System.out.println("Would you like to play again? Please enter Y for yes and N for no.");
            restart = in.nextLine();
        }
        while(restart.equalsIgnoreCase("Y"));
        System.exit(0);
    }
}