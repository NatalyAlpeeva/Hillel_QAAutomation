package dz7;

public class AutomationEngineer extends Employee{
    public String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return null;
    }

    @Override
    public String getPosition() {
        return "Automation Engineer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
}
