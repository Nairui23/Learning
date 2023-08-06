package nair_khachatryan.vehicle;

public abstract class Vehicle {
    public float speedUp(float speed) {
        float newspeeed = speed + 50;
        System.out.println("The speed of the vehicle is equal" + newspeeed);
        return newspeeed;
    }
}
