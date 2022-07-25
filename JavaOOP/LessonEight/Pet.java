package JavaOOP.LessonEight;

public class Pet {
    private String name;
    private int age;
    private String color;
    private String breed;

    public Pet(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String makeSound() {
        return "qwabanga";
    }

    public String getName() {
        return name;
    }
}


