public class Employee {

    protected int id;
    protected String name;
    protected double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public static void main(String[] args) {

        Employee[] employees = {
            new FullTimeEmployee(1, "John", 60000, 5000),
            new Contractor(2, "Sarah", 40, 160)
        };

        for (Employee employee : employees) {
            System.out.println(
                employee.name + " Pay: $" + employee.calculatePay()
            );
        }
    }
}

class FullTimeEmployee extends Employee {

    private double annualBonus;

    public FullTimeEmployee(
        int id,
        String name,
        double baseSalary,
        double annualBonus
    ) {
        super(id, name, baseSalary);
        this.annualBonus = annualBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + annualBonus;
    }
}

class Contractor extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public Contractor(
        int id,
        String name,
        double hourlyRate,
        double hoursWorked
    ) {
        super(id, name, 0);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
