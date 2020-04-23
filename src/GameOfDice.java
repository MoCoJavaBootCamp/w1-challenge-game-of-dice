/*
Pseudocode
import Scanner
import Random
declare roll dice method
declare vars for scanner, random, sum, roll 1, roll 2
greet user
prompt user to roll
define while loop
    check for a single 1
        stop roll
    check for a double 1
        add 25 to sum
        add sum to score
     else
        add r1, r2
        add sum to score
    initialize roll 1 and roll 2
        initialize sum
    print rolls
    print score
    prompt to roll again
        no: thank you for playing

 */
import java.util.Scanner;
import java.util.Random;

public class GameOfDice {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int score = 0;
        int roll1 = 0;
        int roll2 =0;
        String rollAgain = "yes";
        String greeting = "Welcome! Let's Play Roll Dice!";
        String rollPrompt = "Roll again?";

        System.out.printf("%s", greeting);
        while (score < 100) {
            roll1 = random.nextInt(7) + 1;
            roll2 = random.nextInt(7) + 1;

            if (roll1 == 1 && roll2 != 1) {
                rollAgain = "no";
            } else if (roll1 != 1 && roll2 == 1) {
                rollAgain = "no";
            } else if (roll1 == 1 && roll2 == 1) {
                score += 25;
                rollAgain = "yes";
            } else {
                score += roll1 + roll2;
            }

            System.out.printf("\nYour rolls %d & %d", roll1, roll2);
            System.out.printf("\nScore: %d", score);
            System.out.printf("\n%s %s", rollPrompt, rollAgain);
            rollAgain = "yes";
        }

        System.out.println("\nYou have scored over 100\n" +
                "Thank you for playing!");
    }
}
