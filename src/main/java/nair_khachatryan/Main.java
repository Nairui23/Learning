package nair_khachatryan;


import nair_khachatryan.animal.Animal;
import nair_khachatryan.animal.Bird;
import nair_khachatryan.animal.Cat;
import nair_khachatryan.shape.Circle;
import nair_khachatryan.shape.Rectangle;
import nair_khachatryan.shape.Shape;
import nair_khachatryan.shape.Triangle;
import nair_khachatryan.vehicle.Bicycle;
import nair_khachatryan.vehicle.Car;
import nair_khachatryan.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {

        Animal bird = new Bird();
        bird.sound();
        Animal cat = new Cat();
        cat.sound();

        Vehicle bicycle = new Bicycle();
        bicycle.speedUp(100);
        Vehicle car = new Car();
        car.speedUp(20);

        Circle circle = new Circle();
        circle.calculateShapeArea(5);

        Rectangle rectangle = new Rectangle();
        rectangle.calculateShapeArea(10,20);

        Triangle triangle = new Triangle();
        triangle.calculateShapeArea(10,5);


        

    }

}
