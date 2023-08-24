package nair_khachatryan.shape1;

public class Rectangle1 implements Shape_Task{
    double length;
    double width;
    public double getArea() {
        double rectangleArea = length * width;
        System.out.println("The area of rectangle is equal to " + rectangleArea);
        return rectangleArea;
}
}