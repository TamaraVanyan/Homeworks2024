package animal;

public class Monkey extends Animal{
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Ooo ooo aaa");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats bananas.");
    }

    @Override
    public void performTrick() {
        System.out.println(name + " performs trick by swinging from tree branches!");
    }
}
