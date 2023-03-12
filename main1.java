import java.lang.Math;

abstract class Shape {
    public abstract void RectangleArea(int length, int breadth);
    public abstract void SquareArea(int side);
    public abstract void CircleArea(int radius);
}

class Area extends Shape {
    public void RectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
    
    public void SquareArea(int side) {
        int area = side * side;
        System.out.println("Area of square is: " + area);
    }
    
    public void CircleArea(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        // Create an object of class 'Area'
        Area a = new Area();

        // Call all the three methods
        a.RectangleArea(5, 10);
        a.SquareArea(7);
        a.CircleArea(3);
    }
}
