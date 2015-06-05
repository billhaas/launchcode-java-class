import java.util.Scanner;

/**
 * Created by bill on 5/29/15.
 */
//public class NumericAnswerQuestion {}

public class NumericAnswerQuestion extends Question {
    //private double answer;

    //constructor
    public NumericAnswerQuestion(String question, double answer) {
        super(question, answer);
        //this.answer = answer;
    }
//        this.answer = answer;
    //        this.answer1 = answer1;
    //        this.answer2 = answer2;
    //        this.possibleanswer3 = possibleanswer3;
    //        this.possibleAnswer4 = possibleAnswer4;


//    //compose a question like
//    public void testMultipleChoiceQuestion(){
//        Question q = new MultipleChoiceQuestion("To incorporate a parent file in java the proper term is?", "extends",
//                "include", "assimilate", "extends", "incorporate");
//    }

    public void displayQuestion() {
        System.out.println(getQuestion());
    //        System.out.println(this.answer1);
    //        System.out.println(this.answer2);
    //        System.out.println(this.possibleanswer3);
    //        System.out.println(this.possibleAnswer4);
    }

    public static void main(String[] args) {
        //Question q = new MultipleChoiceQuestion("To incorporate a parent file in java the proper term is?", "extends",
        //"include", "assimilate", "extends", "incorporate");
        //q.displayQuestion();
        NumericAnswerQuestion  naq = new NumericAnswerQuestion("What is nine times five?:",
                45);
//        Question q = mcq;
        naq.displayQuestion();
        Scanner s = new Scanner(System.in);
        double userAnswer = s.nextDouble();
        System.out.println(userAnswer);
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
        naq.checkAnswer(userAnswer);

    }
}
