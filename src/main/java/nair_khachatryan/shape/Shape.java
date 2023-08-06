package nair_khachatryan.shape;

public abstract class Shape {
    public double calculateShapeArea(double a, double b) {
        double result = a * b;
        System.out.println("The area of the of the shape is equal to" + result);
        return result;
    }
}
