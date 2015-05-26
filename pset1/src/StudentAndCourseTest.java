import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
/**
 * JUnit tests for Student and Course
 * @author dshook
 *
 */
public class StudentAndCourseTest extends TestCase {


	@Test
	public void testStudentInit() {
		Student s = new Student("Doug", "Shook", 111111);
		assertEquals("Doug Shook", s.getName());
		assertEquals(111111, s.getStudentID());
		//No credits, no GPA
		assertEquals(0.0, s.getGPA());
		assertEquals(0, s.getCredits());

		//Generate some random students, and test
		for (int i = 0; i < 20; ++i) {
			double a = (Math.random() * 5000);
			double b = (Math.random() * 5000);
			int c = (int) (Math.random() * 5000);
			Student s3 = new Student("" + a, "" + b, c);
			assertEquals(a + " " + b, s3.getName());
			assertEquals(0.0, s3.getGPA());
			assertEquals(0, s3.getCredits());
		}
	}

	//More tests should go here

	public void testToString() {
		Student s = new Student("Doug", "Shook", 111111);
		assertEquals("Doug Shook 111111", s.toString());
	}

	// put setter in constructor in student.java for set credits and getclassstanding
	public void testGetClassStanding() {
		Student s = new Student("Doug", "Shook", 111111);
		s.setCredits(35);
		assertEquals("sophomore", s.getClassStanding());
		assertEquals(35, s.getCredits());
	}

	public void testSubmitGrade() {
		Student s = new Student("Doug", "Shook", 111111);
//		s.setCourseGrade(3);
//		s.setCourseCredits(3);
		s.submitGrade(3, 3);
		assertEquals(3.0, s.getGPA());
		assertEquals(3, s.getCredits());
	}

	public void testComputeTuition() {
		Student s = new Student("Doug", "Shook", 111111);
		s.setCredits(35);
		assertEquals(35, s.getCredits());
		assertEquals(47000.0, s.computeTuition());
	}

	public void testCreateLegacy(){
		Student parent1 = new Student("Doug", "Shook", 111111, 2.5, 50);
		Student parent2 = new Student("Mary", "Smith", 222222, 3.5, 40);

		Student child = new Student("Doug Shook", "Mary Smith", 333333, 3.0, 50); //expected

		//USING THE createLegacy() method, create the child;
		Student legacyChild = parent1.createLegacy(parent2);
//		//legacyChild's name
//		String newName = legacyChild.getName();
//
//		//random student ID
//		int newID = 333333;
//
//		//avg of parent1GPA and parent2GPA
//		double newGPA = legacyChild.getGPA();
//
//		//max of parent1 and parent2 credits
//		int newCredits = legacyChild.getCredits(); //(a > b ? b : a)

		//assertEquals(expectedValue, actualValue);
		assertEquals(child.getName(), legacyChild.getName());
		assertEquals(child.getStudentID(), legacyChild.getStudentID());
		assertEquals(child.getGPA(), legacyChild.getGPA());
		assertEquals(child.getCredits(),legacyChild.getCredits());
	}

	public void testCourseInit() {
		Course c = new Course("IntroToCoding", 3, 25);
		assertEquals("IntroToCoding", c.getName());
		assertEquals(3, c.getCredits());
		assertEquals(25, c.getSeats());

	}


	//**`toString()`** - should contain the course number and credits
	public void testToCourseString() {
		Course c = new Course("IntroToCoding", 3, 25);
		assertEquals("IntroToCoding 3 25", c.toString());
	}

	/**`addStudent()`** -
	  * returns a boolean based on whether or not the student was successfully
	 added to the course. RETURN IN COURSE FILE? SO DONT NEED TOSTRING?
	  * Check to make sure
	 that the student has not already enrolled, CODE IN COURSE FILE?
	  * and update the number of seats remaining.
	*/

	public void testAddStudent() {
		// creating course
		Course c = new Course("IntroToCoding", 3, 25);
		// creating student
		Student s = new Student("Doug", "Shook", 111111);

		Student s2 = new Student("Doug2", "Shook2", 222222);
		// checking if student was added
		assertEquals(true, c.addStudent(s));
		assertEquals(24, c.getSeats());
		assertEquals(true, c.addStudent(s2));
		assertEquals(23, c.getSeats());
		assertEquals(false, c.addStudent(s2));
		assertEquals(23, c.getSeats());
		// checking reduction in seats

	}

	//**`printRoster()`** - displays a roster with all of the students in the course. Make sure to omit "empty" seats!
	public void testPrintRoster(){
		// creating course
		Course c = new Course("IntroToCoding", 3, 25);
		// creating student
		Student s = new Student("Doug", "Shook", 111111);
		Student s2 = new Student("Doug2", "Shook2", 222222);
		c.addStudent(s);
		c.addStudent(s2);
		c.printRoster();
	}

	//4 **`averageGPA()`** - returns the average GPA of all students enrolled in the course. Make sure to omit "empty" seats!
	public void testAverageGPA(){

		Course c = new Course("IntroToCoding", 3, 25);
		// creating student
		Student s = new Student("Doug", "Shook", 111111, 3.0, 40);
		Student s2 = new Student("Doug2", "Shook2", 222222, 3.5, 50);
		c.addStudent(s);
		c.addStudent(s2);
		//c.printRoster();
		assertEquals(3.25, c.averageGPA());







	}

}





