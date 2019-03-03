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
            int operatorId = rand.nextInt(4);
            String operator;
            switch (operatorId){
                default:
                case 0:
                    operator = "+";
                    break;
                case 1:
                    operator = "-";
                    break;
                case 2:
                    operator = "*";
                    break;
                case 3:
                    operator = "/";
                    break;
            }

            Question question = new Question(x, y, operator);
            question.showQuestion();

            int response = input.nextInt();
            if (question.checkAnswer(response)){
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
