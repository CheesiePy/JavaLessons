package JavaOOP.LessonEight; // this is the package name (folder name)


// Lesson One - Java OOP - Classes and Objects

public class Main extends Object{  // Main is the class that runs the program
    public static void main(String[] args) { // main is the method that runs the program
        Cat moorcha = new Cat("Moorcha", 3, "white with grey spots ", "Street Cat"); // create a new cat object
        Pet moonCake = new Cat("moonCake", 3, "black with a single white spot ", "Street Cat"); // create a new cat object
        Pet poochky = new Dog("Poochky", 6, "mainly black", "Street Dog"); // create a new dog object
        Pet rufus = new Turtle("Rufus", 6, "mainly white", "Ninja Turtle"); // create a new turtle object

        Pet[] pets = {moorcha, moonCake, poochky}; // create an array of numbers
        // Object[] objects = {moorcha, moonCake, poochky , 21 , "blablba"}; // create an array of numbers 
        System.out.println(poochky.makeSound() + " " + moonCake.makeSound() + " " + moorcha.makeSound()+ " " + rufus.makeSound()); // print the sound of the cat objects
        
    }
}  

