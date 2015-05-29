/**
 * Created by bill on 5/27/15.
*/

//import java.lang.String;

/*public class Cat extends Animal {

    private String meow;

    public Cat(String food, String meow) {
        super("Cat", food);
        this.meow = meow;
    }

    public Cat(String name, String food, String meow){
        super(name, food);
        this.meow = meow;
    }

    */

public class Instructor extends Person {

    private String school;

//doesnt constructor in cat have to include elements of constuctor in animal?
    //constructor
    public Instructor(String firstName, String lastName, String school) {
        super(firstName, lastName);
        this.school = school;
    }

    public String getSchool(){
        return this.school;
    }
}