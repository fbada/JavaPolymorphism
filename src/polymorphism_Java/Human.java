package polymorphism_Java;

public class Human extends Animal {
    String job;
    String passtime;

    public Human(boolean isAlive, String phylum, String name, String job, String passtime) {
        super(isAlive, phylum, name);
        this.job = job;
        this.passtime = passtime;
    }

    public Human(String name, String job, String passtime) {
        super(name);
        this.job = job;
        this.passtime = passtime;
    }

    public Human(String job, String passtime) {
        this.job = job;
        this.passtime = passtime;
    }

    public Human(String name) {
        super(name);
    }

    public Human() {
    }

    @Override
    public void makeSound() {
        System.out.println("HI EVERYONE!!");
    }

    public String introduceYourself(String name) {
        return "My name is " + name + " and I am a human... living my life ...rocking out to human music";
    }
    public String introduceYourself(String name, String passtime){
        return "";
    }
}