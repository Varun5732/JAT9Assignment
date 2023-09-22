package tasks;
public class Employee {
    // Attributes
    private int ID;
    private String name;
    private double salary;

    // Constructor
    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    // Getter for ID
    public int getID() {
        return ID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to raise salary by a percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = (percent / 100) * salary;
            salary += raiseAmount;
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(1, "Darshini", 50000.0);
        // Printing employee details
        System.out.println("Employee ID: " + employee.getID());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Initial Salary: $" + employee.getSalary());

        // Raising the salary by 15%
        employee.raiseSalary(15);

        // Printing updated salary
        System.out.println("Updated Salary: $" + employee.getSalary());
    }
}
