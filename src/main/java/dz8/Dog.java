package dz8;

public class Dog extends Animal implements Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Dog " + getName()+ " says: Woof");
    }
    public void greets(Dog dog) {
        System.out.println( "Woooooooof");
    }
    @Override
    public void feed() {
        System.out.println("Feeding Dog " + getName());

    }

    @Override
    public void walk() {
        System.out.println("Walking Dog " + getName());

    }

    @Override
    public void play() {
        System.out.println("Playing with Dog " + getName());

    }

}
