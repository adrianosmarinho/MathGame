import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This is a simple math game for grades 3 - 5
 * @author Adriano Marinho
 */
public class Main {

    private int score;
    private ArrayList<Question> questions;

    public void playGame(){

        Random rand = new Random();             // for generating random numbers in the questions
        Scanner input = new Scanner(System.in); // for getting the user input

        questions = new ArrayList<Question>();

        // initializes the 10 questions
        for (int i = 0; i < 10; i++){
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
            questions.add(question);
        }

        for (int  i = 0; i < questions.size(); i++){
            Question currentQuestion = questions.get(i);

            currentQuestion.showQuestion();

            int response = input.nextInt();
            if (currentQuestion.checkAnswer(response)){
                System.out.println("Congratulations, your answer is correct!");
                score++;
            }
            else{
                System.out.println("I am sorry but your answer is wrong");
            }

        }

        System.out.println("Game Over, your score was: " + score);

    }

    /**
     * Repeats playGame in case the player wants to playMultipleGames
     */
    public void playMultipleGames(){
        for (int i = 0; i < 10; i++)
            playGame();
    }

    /**
     * Runs the game
     * @param args
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.playMultipleGames();
    }
}
