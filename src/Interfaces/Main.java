package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        Engine car1 = new Car();
//
//        car.accelerate();
//        car.start();
//        car.stop();
        // Which particular method to run ,it's determining at runtime.


        //CHECK THIS AGAIN.
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
