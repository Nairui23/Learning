package nair_khachatryan.vehicle;

public class Bicycle extends Vehicle {
    public float speedUp(float speed) {
        float newspeeed = speed + 20;
        System.out.println("The speed of the vehicle is equal - " + newspeeed);
        return newspeeed;
    }
}
