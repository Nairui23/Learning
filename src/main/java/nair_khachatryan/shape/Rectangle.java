package nair_khachatryan.shape;

public class Rectangle extends Shape {
    @Override
    public double calculateShapeArea(double length, double width) {
        double rectangleArea = length * width;
        System.out.println("The area of rectangle is equal to " + rectangleArea);
        return rectangleArea;
    }

}
