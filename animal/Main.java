package animal;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {new Lion("Simba", 1), new Elephant("Grant", 5),
                new Monkey("Rafiki", 73)};

        for (Animal animal : zoo) {
            animal.printInfo();
            animal.makeSound();
            animal.eat();
            animal.performTrick();
            System.out.println("—————————————");
        }
    }
}
