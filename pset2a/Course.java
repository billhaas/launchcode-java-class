/**
 * Created by bill on 5/20/15.
 */
/*
#Creating a Course class

        B. Next, implement the following functionality:

        1 **`toString()`** - should contain the course number and credits

        2 **`addStudent()`** - returns a boolean based on whether or not the student was successfully
        added to the course. Check to make sure
        that the student has not already enrolled, and update the number of seats remaining.

        3 **`printRoster()`** - displays a roster with all of the students in the course. Make sure to omit "empty" seats!

        4 **`averageGPA()`** - returns the average GPA of all students enrolled in the course. Make sure to omit "empty" seats!

        Once you are finished, make sure you have written at least one test for each method, and that they pass.

        5. In addition to your unit tests, you should also have a main() method in your program that
        creates a few instances of students and courses,
        and tests their functionality.

        C. Then commit and push your code to your repository
        (select the files -> right click -> git -> Commit -> Commit and Push),
        and notify an instructor. You can email Doug at: dsshook@gmail.com.

        D. #Additional Features
This exercise could also be extended to include `Department`, `Instructor`, `University`, and  `Semester` classes.
        Try designing some of these and incorporating them into this problem set if you have time. Don't forget to test!
         The Course class should contain the following properties:

        A. //Add these properties to your class, create a constructor, create some accessors, and test!
        * Name
        * Credits
        * Number of seats
        * Roster of Students
*/

public class Course {
    private String name;
    private int credits;
    private int seats;
    private Student[] roster;// = new Student[25];
    //private int courseNumber;

    public static void main(String args[]){

    }

    //constructor
    public Course (String name, int credits, int seats){
        this.name = name;
        this.credits = credits;
        this.seats = seats;
        this.roster = new Student[seats];

        //this.roster = roster;
        //this.courseNumber = courseNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getCredits() {
        return this.credits;
    }

    public int getSeats() {
        return this.seats;
    }

    // **`toString()`** - should contain the course number and credits??
    public String toString() {
        return this.name + " " + this.credits + " " + this.seats;
    }

    /*
    /*public int getCourseNumber() {
        return this.courseNumber;} */

    // myarray[i] = mything;

//    /if (roster[i] != null) { //if there is student in that slot
//                if (roster[i].getStudentID() == student.getStudentID()) { // if student already added
//                    return false;
//                }else{ // if new student
//                    roster[i] = student;
//                }
//            else { //if there is no student in that slot
//                roster[i] = student;
//            }/Student roster = {s};

    public boolean addStudent(Student student){
        //boolean alreadyRegistered = false;
        // loop through roster and see if you find the student
        for (int i = 0; i < roster.length; i++) {
            //if no student there, add, decrement seats, and return true
            //else if same student, return false
            if (roster[i] == null) {
                roster[i] = student; //add student
                seats = seats - 1;
                return true;
            } else {
                if (roster[i].getStudentID() == student.getStudentID()) {
                    return false;
                }
            }
        }
        return true;
    }

    //printRoster()`** - displays a roster with all of the students in the course.
    // **Make sure to omit "empty" seats!
    public void printRoster() {
        //println each thing in my array with forloop like above
        //return this.roster;
//        System.out.println("roster.length: " + roster.length);
//        System.out.println("roster[0]: " + roster[0]);
//        System.out.println("roster[1]: " + roster[1]);
        for (int i = 0; i < roster.length; i++) {
            // if roster[i] != null print student's name and stid
            // else(if roster[i] == null); (no more students), print nothing
            if (roster[i] != null) {
                System.out.println(roster[i].getName()  + " " + roster[i].getStudentID());
            }
        }
    }

    //4 **`averageGPA()`** - returns the average GPA of all students enrolled in the course. Make sure to omit "empty" seats!
    public double averageGPA(){
        double sum = 0;
        double averageGPA = 0;
        for (int i = 0; i < roster.length; i++) {
            if (roster[i] != null) {
//  roster[i].getGPA(); // getGPA of all students;
                sum = roster[i].getGPA() + sum;
                averageGPA = sum / (i  + 1); //add GPAs divided by number of students;
            }
        }

        return averageGPA;
    }

}
