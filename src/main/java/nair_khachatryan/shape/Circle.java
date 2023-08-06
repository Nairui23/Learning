package nair_khachatryan.shape;

public class Circle extends Shape {
    public double calculateShapeArea(double radius) {
        double circleArea = Math.pow(radius, 2) * 3.14;
        System.out.println("The area of circle is equal to " + circleArea);
        return circleArea;
    }
}
