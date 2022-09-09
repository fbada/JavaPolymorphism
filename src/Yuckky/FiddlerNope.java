package Yuckky;

public class FiddlerNope extends Luci {

    String name;

    public FiddlerNope(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("My name is "+name);
    }

    @Override
    public void nope() {
        System.out.println("God nope .. please NOOO!!");
    }

    @Override
    public void goThroughWalls() {
        System.out.println("Im comming through the walls to gecha!!!");
    }

    public void beGross(){
        System.out.println("Kill me on sight!!... Youll regret not doing eeeeet!!");
    }

    public void bite(){
        System.out.println("I bited you because you do notses killed me.");
    }
}
