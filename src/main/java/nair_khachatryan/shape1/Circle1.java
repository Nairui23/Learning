package nair_khachatryan.shape1;

public class Circle1 implements Shape_Task{
        double radius;
        public double getArea() {
        double circleArea = Math.pow(radius, 2) * 3.14;
        System.out.println("The area of circle is equal to " + circleArea);
        return circleArea;
}
}
