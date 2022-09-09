package Workplace;

public final class UIDesigner extends Employee {


    public UIDesigner(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is designing.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 8 hours. J/K client wants another revision.");
    }

    public void beCreative(){
    System.out.println("Creative juices are flowing for "+getName());
}

}
