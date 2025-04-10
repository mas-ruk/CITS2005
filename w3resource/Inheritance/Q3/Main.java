public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(22.0, 13.0);
        System.out.println(rect.getArea());
    }
}

class Shape {
    public double getArea() {
        return 0.0; // default area
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length*width;
    }
}
