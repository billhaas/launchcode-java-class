import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bill on 6/4/15.
 */

/*#Putting it all together
        You're now ready to present these questions as a Quiz.
        Create a quiz class that will choose a question,
        present it to the user,
        accept the user's response,
        and then tell them whether their answer was correct or incorrect.

        You have two paths for grabbing user input:

        * Scanner can read input from the console (quicker, easier):
        [Scanner API](http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
        * Dialogs use windows and buttons to get user feedback (more complex, but flashier):
        [Dialog Examples](https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html)

        When it comes to testing this portion of the program, be careful:
        good design states that retrieving input should be kept separate and isolated from the rest of the program.
        We want to be able to simulate user input in our tests by provided the appropriate values through method calls.
        We do **not** want to have to sit and type in a bunch of answers to questions just to test our code!

        For this problem set, you know that you have a good design if your Quiz class is fairly short.
        Remember that each of the Question should be responsible for displaying themselves and checking the answers,
        so the Quiz class merely needs to utilize this functionality!

        When you are finished, make sure that all of your unit tests pass, commit and push your code, and notify an instructor.
*/

public class Quiz extends Question {
    private String answer1;
    private String answer2;
    private String possibleanswer3;
    private String possibleAnswer4;
    private static ArrayList<String> userAnswerArray = new ArrayList<>();

    //constructor for mcq and mtoac
    public Quiz(String question, String answer, String answer1, String answer2, String possibleanswer3, String possibleAnswer4) {
        super(question, answer);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.possibleanswer3 = possibleanswer3;
        this.possibleAnswer4 = possibleAnswer4;
    }

    //constructor for fibq
    public Quiz(String question, double answer) {
        super(question, answer);
    }

    public static void main(String[] args) {
        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion("To incorporate a parent file in java the proper term is?:",
                "extends", "include", "assimilate", "extends", "incorporate");
        mcq.displayQuestion();
        Scanner s = new Scanner(System.in);
        String userAnswer = s.next();
        System.out.println(userAnswer);
        mcq.checkAnswer(userAnswer);

        String[] answerArray = {"extends", "include"};
        MoreThanOneAnswerCorrectQuestion mtoac = new MoreThanOneAnswerCorrectQuestion("To incorporate a parent file in java the proper term or terms are?:",
              answerArray, "include", "assimilate", "extends", "incorporate");
        mtoac.displayQuestion();


       for (String oneAnswer : answerArray) {
            mtoac.buildAnswerArray(s.next());
        }
        mtoac.checkAnswer(answerArray);

    //Quiz = mcq;

        FillinBlankQuestion fibq = new FillinBlankQuestion("What does the type Scanner enable the user to do?",
                "input");
        //Question q = mcq;
        fibq.displayQuestion();
        //Scanner s = new Scanner(System.in);
        userAnswer = s.next();
        System.out.println(userAnswer);

        fibq.checkAnswer(userAnswer);
  }
}
        /*not nec

        } */

//constructor
    /*public MoreThanOneAnswerCorrectQuestion(String question, String [] answer, String answer1, String answer2, String possibleanswer3, String possibleAnswer4) {
        super(question, answer);
//        this.answer = answer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.possibleanswer3 = possibleanswer3;
        this.possibleAnswer4 = possibleAnswer4;
    }
    *///MoreThanOne AnswerCorrectQuestion
    /*not nec public void displayQuestion() {
        System.out.println(getQuestion());
        System.out.println("A. " + this.answer1);
        System.out.println("B. " + this.answer2);
        System.out.println("C. " + this.possibleanswer3);
        System.out.println("D. " + this.possibleAnswer4);
    }*/

    /*public static void buildAnswerArray(String oneAnswer){
        userAnswerArray.add(oneAnswer);
    }*/
//FillInBlankQuestion
        /* notnec public void displayQuestion() {
            System.out.println(getQuestion());
        }



        }
        */
//multiple choice question
//not necessary
    /*public void displayQuestion() {
        // not necessary but sometimes useful: super.displayQuestion();
        System.out.println(getQuestion());
        System.out.println(this.answer1);
        System.out.println(this.answer2);
        System.out.println(this.possibleanswer3);
        System.out.println(this.possibleAnswer4);
    }

    //    @Override
    public boolean checkAnswer(String[] answerArray) {

        int i = 0;
        for (String eachAnswer: answerArray){
            if (!eachAnswer.equals(userAnswerArray.get(i))) {
                System.out.println(false);
                return false;
            }
            i++;
        }
        System.out.println(true);
        return true;
    }*/

