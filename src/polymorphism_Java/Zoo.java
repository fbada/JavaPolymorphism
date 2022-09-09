package polymorphism_Java;

    public class Zoo {

        public static void main(String[] args) throws NotDogCatHumanException {
            Dog rocky = new Dog();
            rocky.fetch();
            rocky.makeSound();
            feed(rocky);

            System.out.println("-----------------------------");

            Cat fluffy = new Cat("Fluffy");
            fluffy.makeSound();
            fluffy.scratch();
            System.out.println(fluffy.name);


            Animal sasha = new Dog();
            sasha.makeSound();
            ((Dog)sasha).fetch();
            feed(sasha);

            sasha = new Cat();
            sasha.makeSound();
            ((Cat)sasha).scratch();
            feed(sasha);

            Animal beep = new Animal();
            beep.makeSound();

            try{
                feed(beep);
            }catch (NotDogCatHumanException e){
                System.out.println(e.getMessage());
            }

            System.out.println("+++++++++++++++++");

            Animal jerry = new Human();
            jerry.makeSound();
            System.out.println(((Human)jerry).introduceYourself("Jerry"));
            feed(jerry);

            Human ela = new Human();
            System.out.println(ela.introduceYourself("Ela"));
            ela.makeSound();
        }

        public static void feed(Animal critter) throws NotDogCatHumanException {
            if(critter instanceof Cat){
                System.out.println("Getting the cat food.");
            } else if (critter instanceof Dog) {
                System.out.println("Getting the dog food.");
            } else if (critter instanceof Human) {
                System.out.println("Getting the human food.");
            } else{
                throw new NotDogCatHumanException();
            }
        }
    }

