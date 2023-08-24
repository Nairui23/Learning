package nair_khachatryan.shape;

public class Triangle extends Shape {

    public double calculateShapeArea(double base, double hight) {
        double result = (base * hight) / 2;
        System.out.println("The area of the triangle is equal to " + result);
        return result;
    }
}
