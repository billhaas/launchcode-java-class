/**
 * Created by bill on 6/2/15.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bill on 5/29/15.
 */
//public class MultipleChoiceQuestion {}

public class MoreThanOneAnswerCorrectQuestion extends Question {
    //    private String answer;
    private String answer1;
    private String answer2;
    private String possibleanswer3;
    private String possibleAnswer4;
    private static ArrayList<String> userAnswerArray = new ArrayList<>();

    //constructor
    public MoreThanOneAnswerCorrectQuestion(String question, String [] answer, String answer1, String answer2, String possibleanswer3, String possibleAnswer4) {
        super(question, answer);
//        this.answer = answer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.possibleanswer3 = possibleanswer3;
        this.possibleAnswer4 = possibleAnswer4;
    }

//    //compose a question like
//    public void testMultipleChoiceQuestion(){
//        Question q = new MultipleChoiceQuestion("To incorporate a parent file in java the proper term is?", "extends",
//                "include", "assimilate", "extends", "incorporate");
//    }

    public void displayQuestion() {
        System.out.println(getQuestion());
        System.out.println("A. " + this.answer1);
        System.out.println("B. " + this.answer2);
        System.out.println("C. " + this.possibleanswer3);
        System.out.println("D. " + this.possibleAnswer4);
    }

    public static void buildAnswerArray(String oneAnswer){
        userAnswerArray.add(oneAnswer);
    }

//    @Override
    public boolean checkAnswer(String[] answerArray) {

        int i = 0;
        for (String eachAnswer: answerArray){
//            System.out.println(eachAnswer);
//            System.out.println(answerArray[i]);

            if (!eachAnswer.equals(userAnswerArray.get(i))) {
                System.out.println(false);
                return false;
            }
            i++;
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        //Question q = new MultipleChoiceQuestion("To incorporate a parent file in java the proper term is?", "extends",
        //"include", "assimilate", "extends", "incorporate");
        //q.displayQuestion();
        String [] answerArray = {"extends", "include"};
        MoreThanOneAnswerCorrectQuestion  mtoac = new MoreThanOneAnswerCorrectQuestion("To incorporate a parent file in java the proper term or terms are?:",
                answerArray, "include", "assimilate", "extends", "incorporate");
//        Question q = mcq;
        mtoac.displayQuestion();

        Scanner s = new Scanner(System.in);

//        for(int i = 0; i < answerArray.length; i++) {
//            String oneAnswer = answerArray[i];
//            buildAnswerArray(oneAnswer);
//        }

        for (String oneAnswer: answerArray) {
            buildAnswerArray(s.next());
        }
        //at this point, the arraylist contains the user answers.

        mtoac.checkAnswer(answerArray);
//
//        String[] userAnswer = userAnswerArray.toArray();
//        for(Object okay: userAnswer){
//            System.out.println(okay);
//        }
//
//        for(Object okay: answerArray){
//            System.out.println(okay);
//        }

//        System.out.println(s.next());
//        mtoac.checkAnswer(userAnswer);

    }
}

//PartTimeStudent pts = new PartTimeStudent("Victor", "Li Wang", 333333);
//Student s = pts;


//}

    /* public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
*/
// The Cat class overrides the instance method in Animal and hides the static method in Animal.
// The main method in this class creates an instance of Cat and invokes testClassMethod() on the class and testInstanceMethod() on the instance.
//let's you run class and  to create objects

//    public static void main(String[] args) {
//        //Cat myCat = new Cat();
//        //Type variableName = new Type(...);
//        PartTimeStudent pts = new PartTimeStudent("Victor", "Li Wang", 333333);
//        //Animal myAnimal = myCat;
//        //pts = new PartTimeStudent();
//        Student s = pts;
//        // Animal.testClassMethod();
//        // myAnimal.testInstanceMethod();
//        // Student.testcomputeTuition();
//        System.out.println(s.computeTuition());
//}

