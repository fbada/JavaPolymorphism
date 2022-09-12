package polymorphism_Java;

public class Dog extends Animal implements Playable{

    @Override
    public void makeSound() {
        System.out.println("Woof");;
    }

    public void fetch(){

        System.out.println("Gonna Fetch that STICK !!!");
    }

    @Override
    public void play() {
        System.out.println("Love to play with you!");
    }
}
