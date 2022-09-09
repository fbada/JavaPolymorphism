package Workplace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Workplace {

    public static void main(String[] args) {

        Employee tester = new Tester("BAz", 27, 'M', 125533, "SET", 120000);
        tester.eat();
        ((Tester)tester).bugReport();
        ((Tester)tester).work();
        System.out.println("-------------------------------------------------------");

        Person person = new UIDesigner("Jo", 32, 'F', 1245552, "Mobile UI", 140000);
        person.getAge();
        person.setAge(34);
        ((UIDesigner)person).sleep();
        ((UIDesigner)person).beCreative();
        System.out.println(person);
        person.eat();

        System.out.println("-------------------------------------------------------");
        Employee[] employees = {
                new Tester("Sherali", 32, 'M',132323, "QA", 110000),
                new UIDesigner("Zuhal", 27, 'F', 223322, "AR/VR UI Designer", 128000),
                new Tester("George", 28,'M', 32333, "SDET", 120000),
                new Developer("Cristina", 23, 'F',32334, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',52323, "SDET", 105000),
        };

        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee employee : employees) {
            if(employee instanceof Tester || employee instanceof Developer){
                scrumMembers.add(employee);
            }
        }

        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers) {
            if(scrumMember instanceof Tester){
                testers.add((Tester) scrumMember);
            }

            if(scrumMember instanceof Developer){
                developers.add((Developer) scrumMember);
            }

        }


        System.out.println(testers);
        System.out.println(developers);
        System.out.println(scrumMembers);

        String name = developers.get(0).getName();
        System.out.println(name);

        testers.get(1).getAge();
        testers.get(1).bugReport();

    }

}
