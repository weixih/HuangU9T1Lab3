public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BB8123", 7.0, 3);
        Car car = new Car("MK4567", 6.75, 4, true);
        Truck truck = new Truck("TB12MX", 15.50, 2, 4, true);
        Taxi taxi = new Taxi("TX1412", 13.75, 4, true, 2.0);

        vehicle.honk();
        car.honk();
        truck.honk();
        taxi.honk();



    }
}