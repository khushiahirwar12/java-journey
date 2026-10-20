class Car {
    String brand;
    String model;
    int year;
    double price;

    void startEngine() {
        System.out.println(brand + " " + model + " engine started... Vroom!");
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : Rs. " + price + " Lakhs");
        System.out.println("---------------------------");
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Tata";
        car1.model = "Harrier";
        car1.year = 2024;
        car1.price = 22.5;

        Car car2 = new Car();
        car2.brand = "Mahindra";
        car2.model = "XUV700";
        car2.year = 2023;
        car2.price = 24.0;

        car1.displayDetails();
        car1.startEngine();

        System.out.println();

        car2.displayDetails();
        car2.startEngine();
    }
}
