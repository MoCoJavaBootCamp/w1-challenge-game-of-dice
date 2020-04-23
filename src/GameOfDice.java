/*
Pseudocode
import Scanner
import Random
declare roll dice method
declare vars for scanner, random, score, roll 1, roll 2, roll again
greet user
prompt user to roll
define while loop
    check for a double 1
        add 25 to score
    check for a single 1
        0 to score
     else
        add r1, r2 to score
    print rolls
    print score
    prompt to roll again.
  if no or over 100:
    thank you for playing

 */
import java.util.Scanner;
import java.util.Random;

public class GameOfDice {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int score = 0;
        int roll1, roll2;
        String rollAgain = "yes";
        String greeting = "Welcome! Let's Play Roll Dice!";
        String rollPrompt = "Roll again?";

        System.out.printf("%s", greeting);
        while (rollAgain.equals("yes")) {
                roll1 = random.nextInt(6) + 1;
                roll2 = random.nextInt(6) + 1;

                if (roll1 == 1 && roll2 == 1) {
                    score += 25;
                } else if (roll1 == 1 || roll2 == 1) {
                    score += 0;
                } else {
                    score += roll1 + roll2;
                }

                System.out.printf("\nYour rolls %d & %d", roll1, roll2);
                System.out.printf("\nScore: %d", score);
                System.out.printf("\n%s ", rollPrompt);
                rollAgain = input.nextLine();

            if (score > 100) {
                System.out.println("\nYou have scored over 100");
                break;
            }
        }

        System.out.println("Thank you for playing!");
    }
}
