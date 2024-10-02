// include the necessary libraries

class Car {
    public:
        //attributes
        string make;
        string model;
        int year;
        // Constructor
        Car(string make, string model, int year);
        // Method to display car information
        void displayInfo() { 
            cout << "Make:" + make;
            cout << "Model: " + model; 
            cout << "Year: " + year;
        }
};

int main() {
    // Create a Car object
    Car car;
    car.make = "Toyota";
    car.model = "Yaris"; 
    car.year = 2020;
    }

    // Display car details
    Car.displayInfo();

    return 0;
}
