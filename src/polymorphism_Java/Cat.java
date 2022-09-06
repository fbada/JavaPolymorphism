package polymorphism_Java;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow!!");
    }

    public void scratch(){
        System.out.println("I'm gonna scratch YOU!!");
    }
}

