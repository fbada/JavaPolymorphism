package polymorphism_Java;

public class Human extends Animal {

    @Override
    public void makeSound() {
        System.out.println("HI EVERYONE!!");
    }

    public String introduceYourself(String name) {
        return "My name is " + name + " and I am a human... living my life ...rocking out to human music";
    }
}