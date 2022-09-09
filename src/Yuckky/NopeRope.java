package Yuckky;

public class NopeRope extends Luci {

String name;
boolean isDangerous;
String species;

    public NopeRope(String name, boolean isDangerous, String species) {
        this.name = name;
        this.isDangerous = isDangerous;
        this.species = species;
    }

    public NopeRope(String name) {
        this.name = name;
    }

    public NopeRope(boolean isDangerous, String species) {
        this.isDangerous = isDangerous;
        this.species = species;
    }

    @Override
    public void nope() {
        System.out.println("Watch out for the rocks and fallen branches");
    }

    @Override
    public void goThroughWalls() {
        System.out.println("Gonna get to you through the walls");
    }

    public void makeNoise(){
        System.out.println("HISSS!!!");
    }
}
