package tasks;
public class Circle {
    // Data member
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0
        Circle circle = new Circle(20.0);

        // Calculate and print the circumference
        double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle with radius " + circle.getRadius() + " is: " + circumference);
    }
}
