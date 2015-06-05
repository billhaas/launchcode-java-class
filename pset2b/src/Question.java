/**
 * Created by bill on 5/29/15.
 */
/*
public class Person {
    private String name;


    //constructor
    public Person(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public String getName() {
        return this.name;
    }
}
 */

public class Question {
    private String question;
    private Object answer;

    //constructor
    public Question(String question, Object answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }

    //dont need really because of how code used in child
    public Object getAnswer() {
        return answer;
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    //check the answer the user gives you against the answer
    //if correct, return true
    //else, return false

    public boolean checkAnswer(Object userAnswer) {
        if (userAnswer.equals(answer))
        {
            System.out.println(true);
            return true;
        }
        else
        {
            System.out.println(false);
            return false;
        }
    }

}




