/**
 * Created by bill on 5/28/15.
 */
public class PartTimeStudent extends Student {
    // private String name;
    // private int studentID;
    // private double gpa;
    // private int credits;


    //constructor
    public PartTimeStudent(String firstName, String lastName, int studentID) {
        super(firstName, lastName, studentID);
        // this.studentID = studentID;
        // this.gpa = 0;
        // this.credits = 0;
    }

// overriding compute tuition method from student.java
    /*
    public class Animal
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

//The second class, a subclass of Animal, is called Cat:

    // public class Cat extends Animal {
    // public static void testClassMethod() {
    //    System.out.println("The static method in Cat");
    }*/

    public double computeTuition() {
        //int remainder = (credits % 15);
        return (this.getCredits() * 300);
    }

    /* public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
*/
    // The Cat class overrides the instance method in Animal and hides the static method in Animal.
    // The main method in this class creates an instance of Cat and invokes testClassMethod() on the class and testInstanceMethod() on the instance.
    // ??
    public static void main(String[] args) {
        //Cat myCat = new Cat();
        //Type variableName = new Type(...);
        PartTimeStudent pts = new PartTimeStudent("Victor", "Li Wang", 333333);
        //Animal myAnimal = myCat;
        //pts = new PartTimeStudent();
        Student s = pts;
        // Animal.testClassMethod();
        // myAnimal.testInstanceMethod();
        // Student.testcomputeTuition();
        System.out.println(s.computeTuition());
    }


}