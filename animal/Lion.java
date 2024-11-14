package animal;

public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Roar");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat.");
    }
}
