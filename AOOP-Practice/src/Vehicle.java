abstract class Vehicle {
    public String model;
    public String registrationNumber;
    public String rentalPrice;

    public Vehicle(String model, String registrationNumber, String rentalPrice) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.rentalPrice = rentalPrice;
    }

    public double calculateRentalCost(int days) {
        return days * Double.parseDouble(rentalPrice);
    }

    abstract void displayDetails();

}

class Car extends Vehicle {
    public boolean hasAirConditioning;

    public Car(String model, String registrationNumber, String rentalPrice, boolean hasAirConditioning) {
        super(model, registrationNumber, rentalPrice);
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Rental Price: " + rentalPrice);
        System.out.println("Air Conditioning: " + (hasAirConditioning ? "Yes" : "No"));
    }
}

class Bike extends Vehicle {
    public boolean hasHelmet;

    public Bike(String model, String registrationNumber, String rentalPrice, boolean hasHelmet) {
        super(model, registrationNumber, rentalPrice);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("Model: " + model);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Rental Price: " + rentalPrice);
        System.out.println("Helmet: " + (hasHelmet ? "Yes" : "No"));
    }
}

class RentalService{
    void rentVehicle(Vehicle vehicle, int days){
        System.out.println("Total Rental Cost: " + vehicle.calculateRentalCost(days));
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "ABC123", "1000", true);
        Bike bike = new Bike("Honda", "XYZ456", "500", true);

        car.displayDetails();
        bike.displayDetails();

        RentalService rentalService = new RentalService();
        rentalService.rentVehicle(car, 5);
        rentalService.rentVehicle(bike, 3);
    }
}