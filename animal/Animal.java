package animal;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public abstract void makeSound();

    public abstract void eat();

    public void performTrick() {}
}
