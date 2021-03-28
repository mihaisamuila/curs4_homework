package exSealedClasses;

public non-sealed class Chicken extends Bird {
    @Override
    public void eat() {
        System.out.println("Chicken eats corn");
    }
}
