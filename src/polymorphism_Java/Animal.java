package polymorphism_Java;

public class Animal {

    protected boolean isAlive;
    protected String phylum;
    protected String name;

    public Animal(boolean isAlive, String phylum, String name) {
        this.isAlive = isAlive;
        this.phylum = phylum;
        this.name = name;
    }

    public Animal(String name) {
    }

    public Animal() {
    }

    public void makeSound(){

        System.out.println("default animal sound");
    }
}
