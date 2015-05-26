/**
 * Created by bill on 5/15/15.
 */


//Class and properties
public class Student {
    private String name;
    private int studentID;
    private double gpa;
    private int credits;
//    private int courseCredits;
//    private int courseGrade;

    //constructor
    public Student(String firstName, String lastName, int studentID) {
        this.name = firstName + " " + lastName;
        this.studentID = studentID;
        this.gpa = 0;
        this.credits = 0;
    }

    //new constructor for legacy student
    public Student(String firstName, String lastName, int studentID, double gpa, int credits) {
        this.name = firstName + " " + lastName;
        this.studentID = studentID;
        this.gpa = gpa;
        this.credits = credits;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public double getGPA() {
        return this.gpa;
    }

    public int getCredits() {
        return this.credits;
    }

    public String toString() {
        return this.name + " " + this.studentID;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getClassStanding() {
        if (credits < 30) {
            return "freshman";
        } else if (credits >= 30 && credits < 60) {
            return "sophomore";
        } else if (credits >= 60 && credits < 90) {
            return "junior";
        } else {
            return "senior";
        }
    }

//    public void setCourseGrade(int courseGrade) { this.courseGrade = courseGrade;
//    }public void setCourseCredits(int courseCredits){ this.courseCredits = courseCredits;

    public void submitGrade(int courseGrade, int courseCredits) {
        double newQualityScore = ((gpa * credits) + (courseCredits * courseGrade));
        credits = courseCredits + credits;
        gpa = newQualityScore / credits;
    }

    public double computeTuition() {
        int remainder= (credits % 15);
        return ((credits / 15 * 20000) + (remainder * 1400));
        }

    public Student createLegacy(Student student) {
        //first name is first parent's fullname
        String newFirstName = this.name;

        //last name is the second parent's fullname
        String newLastName = student.name; //student.getName();

        //random student ID
        int newID = 333333;

        //avg of parent1GPA and parent2GPA
        double newGPA = (this.gpa + student.gpa) / 2;

        //max of parent1 and parent2 credits
        int newCredits = (this.credits < student.credits ? student.credits : this.credits); //(a > b ? b : a)

        //then i want to create a new student
        Student child = new Student(newFirstName, newLastName, newID, newGPA, newCredits);

        //return new student
        return child;
    }
}



