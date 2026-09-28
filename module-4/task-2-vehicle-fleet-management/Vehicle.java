public class Vehicle {

    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getSpecs() {
        return year + " " + make + " " + model;
    }

    public static void main(String[] args) {

        Vehicle car =
            new Car("Toyota", "Camry", 2025, 4);

        Vehicle truck =
            new ElectricTruck(
                "Tesla",
                "Semi",
                2026,
                500,
                36000
            );

        System.out.println(car.getSpecs());
        System.out.println(truck.getSpecs());
    }
}

class Car extends Vehicle {

    private int numDoors;

    public Car(
        String make,
        String model,
        int year,
        int numDoors
    ) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public String getSpecs() {
        return super.getSpecs()
            + " | Doors: "
            + numDoors;
    }
}

class ElectricTruck extends Vehicle {

    private double batteryCapacity;
    private double payloadCapacity;

    public ElectricTruck(
        String make,
        String model,
        int year,
        double batteryCapacity,
        double payloadCapacity
    ) {
        super(make, model, year);

        this.batteryCapacity = batteryCapacity;
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getSpecs() {
        return super.getSpecs()
            + " | Battery: "
            + batteryCapacity
            + " kWh | Payload: "
            + payloadCapacity
            + " kg";
    }
}
