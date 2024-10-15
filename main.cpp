#include <iostream>
#include <string>

class Car {
    private:
    string make;
    string model;
    int year;
    int currentYear = 2024;

    // Constructor
    Car(string Make, string Model, int Year) {
        make = Make;
        model = Model;
        year = Year;
    }

    // Method to display car information
    public:
   void showInfo() {
       cout << "Make:" << make << endl;
       cout << "Model: " << model << endl;
       cout << "Year: " << year << endl;    
   }
    void getCarAge() {
        cout << "Car age: " << (currentYear - year) << endl;
    }
    bool isSameCar(const Car& otherCar) const {
        return (make == otherCar.make && model == otherCar.model && year == otherCar.year); 
    }
};

int main() {
    // Create a Car object
    Car Car1("Toyota", "Yaris", 2020);
    Car Car2("BMW", "XM", 2018);
    
    // Display car details
    Car1.showInfo();
    Car1.isSameCar(Car2);

    
    return 0;
}
