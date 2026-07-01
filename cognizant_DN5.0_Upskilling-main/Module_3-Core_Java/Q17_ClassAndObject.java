class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make; this.model = model; this.year = year;
    }
    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}

public class Q17_ClassAndObject {
    public static void main(String[] args) {
        new Car("Toyota", "Camry", 2022).displayDetails();
        new Car("Honda", "Civic", 2023).displayDetails();
    }
}
