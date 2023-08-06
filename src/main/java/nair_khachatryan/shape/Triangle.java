package nair_khachatryan.shape;

public class Triangle extends Shape {

    public float calculateShapeArea(float base, float hight) {
        float result = (base * hight) / 2;
        System.out.println("The area of the triangle is equal to " + result);
        return result;
    }
}
