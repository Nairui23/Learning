package nair_khachatryan.shape1;

public class Triangle1 implements Shape_Task{
            double base;
            double hight;
            public double getArea() {
            double result = (base * hight) / 2;
            System.out.println("The area of the triangle is equal to " + result);
            return result;
    }

}
