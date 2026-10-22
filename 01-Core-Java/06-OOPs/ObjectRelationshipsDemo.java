import java.util.ArrayList;
import java.util.List;

class Engine {
    private String engineType;

    Engine(String engineType) {
        this.engineType = engineType;
    }

    void startEngine() {
        System.out.println("Engine (" + engineType + ") running smoothly.");
    }
}

class MusicSystem {
    private String brand;

    MusicSystem(String brand) {
        this.brand = brand;
    }

    void play() {
        System.out.println("Music System (" + brand + ") playing tracks.");
    }
}

class Car {
    private String model;
    private final Engine engine;
    private MusicSystem musicSystem;

    Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }

    void installMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    void drive() {
        System.out.println("Driving " + model + ":");
        engine.startEngine();
        if (musicSystem != null) {
            musicSystem.play();
        } else {
            System.out.println("No music system installed.");
        }
    }
}

class Department {
    private String deptName;
    private List<String> staffMembers = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addMember(String staffName) {
        staffMembers.add(staffName);
    }

    void showDepartmentInfo() {
        System.out.println("Department: " + deptName + " | Members: " + staffMembers);
    }
}

public class ObjectRelationshipsDemo {
    public static void main(String[] args) {
        String leadEngineer = "Khushi Ahirwar";
        System.out.println("System Architect: " + leadEngineer);
        System.out.println("----------------------------------------------");

        System.out.println("--- 1. Aggregation (Weak Association) ---");
        Department itDept = new Department("Core Engineering");
        itDept.addMember(leadEngineer);
        itDept.addMember("Aman Verma");
        itDept.showDepartmentInfo();

        System.out.println("\n--- 2. Composition (Strong Association / Lifecycle Bound) ---");
        Car electricCar = new Car("NexGen EV", "Permanent Magnet AC Motor");
        MusicSystem sonyAudio = new MusicSystem("Sony Hi-Res");
        electricCar.installMusicSystem(sonyAudio);
        electricCar.drive();
    }
}
