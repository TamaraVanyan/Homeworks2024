package animal;

public class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Phrrrr");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats grass and fruits.");
    }

    @Override
    public void performTrick() {
        System.out.println(name + " performs trick by spraying water");
    }
}
