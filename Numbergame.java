import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scn = new Scanner(System.in);

        int RandomNum = ran.nextInt(100) + 1;
        int k = 5;
        int j = 0;
        System.out.println(RandomNum);

        while (j < k) {
            System.out.println("Guess a number between 1 and 100");

            int playerguess = scn.nextInt();

            if (playerguess == RandomNum) {
                System.out.println("Correct!");
                break;
            } else if (RandomNum > playerguess && j != k - 1) {
                System.out.println("NO! The correct number is higher. Try again");

            } else if (RandomNum < playerguess && j != k - 1) {
                System.out.println("NO! The correct number is lower. Try again");
            }
            j++;
        }
        if (j == k) {
            System.out.println(
                    "You have exhausted your all trials");

            System.out.println("The number was " + RandomNum);
        }
        int score;
        score = 15 - 3 * j;
        System.out.println("your score is " + score);
    }
}