package nair_khachatryan.vehicle;

public class Car extends Vehicle{
        @Override
        public float speedUp(float speed) {
                float newspeeed = speed + 100;
                System.out.println("The speed of the vehicle is equal - " + newspeeed);
                return newspeeed;
        }

}
