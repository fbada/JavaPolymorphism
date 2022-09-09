package polymorphism_Java;

public class NotDogCatHumanException extends Exception{

    public NotDogCatHumanException() {
        super("Not a cat, human or a dog.");
    }
}

