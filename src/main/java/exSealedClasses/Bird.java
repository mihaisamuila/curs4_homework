package exSealedClasses;

public sealed abstract class Bird implements Animal permits Canary, Parrot, Chicken  {
    @Override
    public abstract void eat();
}
