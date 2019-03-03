/**
 * The Question model, so we can easily generate different questions
 * @author Adriano Marinho
 */
public class Question {
    int value1;
    int value2;
    String operator;

    public Question(int value1, int value2, String operator){
        this.value1 = value1;
        this.value2 = value2;
        this.operator = operator;

        // little trick to generate easy integer divisions
        if (operator.equals("/")){
            this.value1 = this.value1 * this.value2;
        }
    }

    /**
     * Displays the question.
     */
    public void showQuestion(){
        System.out.println("What is " + value1 + " " + operator + " " + value2 + "?");
    }

    /**
     * Checks if a given response is correct
     * @param response The response given by the user
     * @return true if the response is correct, false otherwise
     */
    public boolean checkAnswer(int response){
        boolean retValue = false;

        switch(operator){
            default:
            case "+":
                if (response == (value1 + value2))
                    retValue = true;
                break;
            case "-":
                if (response == (value1 - value2))
                    retValue = true;
                break;
            case "*":
                if (response == (value1 * value2))
                    retValue = true;
                break;
            case "/":
                if (response == (value1 / value2))
                    retValue = true;
                break;
        }

        return retValue;
    }
}
