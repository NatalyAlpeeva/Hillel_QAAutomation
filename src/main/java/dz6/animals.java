package dz6;

public class animals {
    public static void main(String[] args) {
        Animal tiger=new Animal(false, "other animals", 4);
        System.out.println(tiger.getNoOfLegs());
        Cat cat=new Cat(true, "fish", 4);
        System.out.println(cat.getEats());
        cat.Mew();
        System.out.println(cat.getColor());
    }
}
