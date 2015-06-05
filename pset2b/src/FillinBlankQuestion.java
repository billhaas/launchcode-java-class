import java.util.Scanner;

/**
 * Created by bill on 5/29/15.
 */
//public class FillinBlankQuestion {}

public class FillinBlankQuestion extends Question {


    //constructor
    public FillinBlankQuestion(String question, String answer) {
        super(question, answer);

    }

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
        FillinBlankQuestion fibq = new FillinBlankQuestion("What does the type Scanner enable the user to do?",
                "input");
//        Question q = mcq;
        fibq.displayQuestion();
        Scanner s = new Scanner(System.in);
        String userAnswer = s.next();
        System.out.println(userAnswer);
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
        fibq.checkAnswer(userAnswer);

    }
}