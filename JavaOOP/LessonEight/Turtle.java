package JavaOOP.LessonEight;

public class Turtle extends Pet{
    private String colorOfShell;

    public Turtle(String name, int age, String color, String breed) {
        super(name, age, color, breed);

        this.colorOfShell = "Green";
    }
    
    public Turtle(String name, int age, String color, String breed, String colorOfShell) {
        super(name, age, color, breed);

        this.colorOfShell = colorOfShell;
    }
}
