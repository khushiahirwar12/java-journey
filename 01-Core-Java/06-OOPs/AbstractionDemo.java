abstract class Vehicle {
    String owner;

    Vehicle(String owner) {
        this.owner = owner;
    }

    abstract void start();
    abstract void stop();

    void displayOwner() {
        System.out.println("Vehicle Owner: " + owner);
    }
}

interface GPS {
    void trackLocation();
}

interface MusicSystem {
    void playMusic(String track);
}

class ElectricCar extends Vehicle implements GPS, MusicSystem {

    ElectricCar(String owner) {
        super(owner);
    }

    @Override
    void start() {
        System.out.println("Electric car turned ON silently with start button.");
    }

    @Override
    void stop() {
        System.out.println("Electric car stopped and parking brake engaged.");
    }

    @Override
    void trackLocation() {
        System.out.println("GPS Active: Current coordinates tracked.");
    }

    @Override
    void playMusic(String track) {
        System.out.println("Playing audio track: '" + track + "'");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar("Khushi Ahirwar");

        car.displayOwner();
        car.start();
        car.trackLocation();
        car.playMusic("Journey Beats");
        car.stop();
    }
}
