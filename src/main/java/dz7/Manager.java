package dz7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Manager extends Employee {
    public String lastName;
    Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;

    }

    public Employee[] getTeam() {
        return team;
    }

    public void setTeam(Employee[] team) {
        this.team = team;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    public void setTeamMembers(Employee... employees) {

        team = employees;
    }

    @Override
    public String getInfo() {
        return getName() + " is a " + getSeniority() + " " + getPosition() + " and has a team of " + team.length + " members: " + arrToString(team);
    }

    public String arrToString(Employee[] team) {
        String[] result = new String[team.length];
        for (int i = 0; i < team.length; i++) {
            result[i] = team[i].getName();
        }
        return Arrays.toString(result);
    }
}






