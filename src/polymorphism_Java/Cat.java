package polymorphism_Java;

public class Cat extends Animal{

    boolean isNice;

    public Cat(boolean isAlive, String phylum, String name, boolean isNice) {
        super(isAlive, phylum, name);
        this.isNice = isNice;
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!!");
    }

    public void scratch(){
        isNice = false;
        System.out.println("I'm gonna scratch YOU!! NIce: "+isNice);
    }
}

