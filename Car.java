import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private int year;
    private int currentYear = 2024;

    // Constructor
    public Car(String Make, String Model, int Year) {
        make = Make;
        model = Model;
        year = Year;
    }

    // Method to display car information
    public void showInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void getCarAge() {
        System.out.println("Car age: " + (currentYear - year));
    }

    public boolean isSameCar(Car otherCar) {
        return (make.equals(otherCar.make) && model.equals(otherCar.model) && year == otherCar.year);
    }

    public static void main(String[] args) {
        // Create a Car object
        Car Car1 = new Car("Toyota", "Yaris", 2020);
        Car Car2 = new Car("BMW", "XM", 2018);
        
        // Display car details
        Car1.showInfo();
        Car1.isSameCar(Car2);

        // Additional call to check car age
        Car1.getCarAge();
    }
}
