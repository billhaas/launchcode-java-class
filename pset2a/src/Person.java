/**
 * Created by bill on 5/27/15.
 */


/*public class Animal {

    private String name;
    private String foodSource;

    public Animal(String name, String food) {
        this.name = name;
        this.foodSource = food;
    }

    public void eat() {
        System.out.println("I am eating " + this.foodSource);
    }

    public void sleep() {
        System.out.println("zzzzzzzz");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        String x = s.next();
        System.out.println("You gave me the number: " + x);
    }

}
*/


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