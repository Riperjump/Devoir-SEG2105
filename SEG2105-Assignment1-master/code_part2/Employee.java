package code_part2;

public class Employee {
    private String name;
    private int hours;
    private double rate;
    private Address[] Address;

    public Employee(String name, int hours, double rate, Address[] Address) {
        this.Address = Address;
        this.name = name;
        this.hours = hours;
        this.rate = rate;

    }

    public String toString() {
        return ("L'employe du nom de " + name + " a "
                + hours + " heures et un salaire de " + rate + "$");
    }
}
