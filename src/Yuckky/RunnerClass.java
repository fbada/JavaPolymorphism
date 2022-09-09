package Yuckky;

public class RunnerClass {

    public static void main(String[] args) {

        FiddlerNope spidey = new FiddlerNope("Hannah");
        spidey.sayHello();
        spidey.beGross();
        spidey.bite();
        spidey.nope();
        spidey.burning();
        spidey.goThroughWalls();

        System.out.println();
        NotHeaven reginald = new FiddlerNope("Reggie");
        reginald.burning();
        ((FiddlerNope)reginald).nope();
        ((FiddlerNope)reginald).bite();
        ((FiddlerNope)reginald).beGross();
        ((FiddlerNope)reginald).goThroughWalls();
        System.out.println();

        NotHeaven snake = new NopeRope("Clara", true, "Water Moccasin");
        System.out.println( ((NopeRope) snake).isDangerous);
        System.out.println(((NopeRope) snake).name);
        System.out.println(((NopeRope) snake).species);
        snake.burning();
        ((NopeRope)snake).makeNoise();


    }

}
