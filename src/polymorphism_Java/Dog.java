package polymorphism_Java;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof");;
    }

    public void fetch(){

        System.out.println("Gonna Fetch that STICK !!!");
    }
}
