package exSealedClasses;

public class Main {

    public static void main(String[] args) {
        Animal azorel = new Dog();
        azorel.eat();

        Animal musca = new Fly();
        musca.eat();

        Parrot papagal = new Parrot();
        papagal.eat();
    }
}
