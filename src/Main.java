import java.util.Random;
import java.util.Scanner;

/**
 * This is a simple math game for grades 3 - 5
 * @author Adriano Marinho
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Random rand = new Random();             // for generating random numbers in the questions
        Scanner input = new Scanner(System.in); // for getting the user input

        int score = 0;
        for (int  i = 0; i < 10; i++){
            int x = rand.nextInt(11) + 1;
            int y = rand.nextInt(11) + 1;
            System.out.println("What is " + x + " + " + y + "?");
            int response = input.nextInt();

            if (response == (x+y)){
                System.out.println("Congratulations, your answer is correct!");
                score++;
            }
            else{
                System.out.println("I am sorry but your answer is wrong");
            }

        }

        System.out.println("Game Over, your score was: " + score);
    }
}
