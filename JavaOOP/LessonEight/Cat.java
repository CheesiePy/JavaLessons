package JavaOOP.LessonEight;

public class Cat extends Pet{ // Cat is the class

    public Cat(String name, int age, String color, String breed) {
        super(name, age, color, breed); // super is the keyword that calls the parent class
    }

    public String makeSound() {
        return "meow";
    }   
    
}
