package exSealedClasses;

public sealed interface Animal  permits Cat,Dog,Bird,Insects {
    public void eat ();
}
