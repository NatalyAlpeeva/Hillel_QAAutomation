package dz6;

public class Cat extends Animal{
    private String color;

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color="white";
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Mew() {
        System.out.println(getColor()+" cat can say mew and eats"+" " +getEats());
    }
}
