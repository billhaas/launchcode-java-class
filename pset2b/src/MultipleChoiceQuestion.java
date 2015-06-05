import java.util.Scanner;

/**
 * Created by bill on 5/29/15.
 */
//public class MultipleChoiceQuestion {}

public class MultipleChoiceQuestion extends Question {
//        private String answer;
    private String answer1;
    private String answer2;
    private String possibleanswer3;
    private String possibleAnswer4;

    //constructor
    public MultipleChoiceQuestion(String question, String answer, String answer1, String answer2, String possibleanswer3, String possibleAnswer4) {
        super(question, answer);
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
        // not necessary but sometimes useful: super.displayQuestion();
        System.out.println(getQuestion());
        System.out.println(this.answer1);
        System.out.println(this.answer2);
        System.out.println(this.possibleanswer3);
        System.out.println(this.possibleAnswer4);
    }

    public static void main(String[] args) {
        //Question q = new MultipleChoiceQuestion("To incorporate a parent file in java the proper term is?", "extends",
                //"include", "assimilate", "extends", "incorporate");
        //q.displayQuestion();
        MultipleChoiceQuestion  mcq = new MultipleChoiceQuestion("To incorporate a parent file in java the proper term is?:",
                "extends", "include", "assimilate", "extends", "incorporate");
//      Question q = mcq;
        mcq.displayQuestion();
        Scanner s = new Scanner(System.in);
        String userAnswer = s.next();
        System.out.println(userAnswer);
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
        mcq.checkAnswer(userAnswer);

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
