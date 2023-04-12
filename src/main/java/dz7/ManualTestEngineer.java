package dz7;

public class ManualTestEngineer extends Employee {
    public String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Test Engineer";
    }

    @Override
    public String getSeniority() {
        return "Manual";
    }
}
