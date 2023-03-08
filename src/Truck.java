public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Axels: " + axles);
        System.out.println("Has Trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate(){
        String str = getLicensePlate().substring(getLicensePlate().length()-2);
        if(hasTrailer){
            if(axles > 4 && str.equals("MX")){
                    return true;
            }else if(axles <= 4 && str.equals("LX")){
                    return true;
            }
            return false;
        }
        return true;

    }
}