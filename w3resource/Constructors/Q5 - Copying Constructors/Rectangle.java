public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a new Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(12.5, 4.5);
        // Print the values of the instance variables for rect1
        System.out.println("Rectangle 1 Length: " + rect1.length);
        System.out.println("Rectangle 1 Width: " + rect1.width);

        // Create a new Rectangle object using the copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        // Print the values of the instance variables for rect2
        System.out.println("Rectangle 2 Length: " + rect2.length);
        System.out.println("Rectangle 2 Width: " + rect2.width);
    }
}