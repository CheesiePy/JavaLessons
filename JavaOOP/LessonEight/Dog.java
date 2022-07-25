package JavaOOP.LessonEight;

public class Dog extends Pet{
    public Dog(String name, int age, String color, String breed) {
        super(name, age, color, breed);
    }

    public String makeSound() {
        return "rwolf";
    }
    
}
