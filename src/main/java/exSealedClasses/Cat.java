package exSealedClasses;

public record Cat(String name) implements Animal {
    public void eat() {
        System.out.println("Cat eats Whiskas");
    }

}
