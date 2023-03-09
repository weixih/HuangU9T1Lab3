public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
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

    @Override
    public double calculateTollPrice(){
        if(hasTrailer){
            return 2 * axles * getTollFee();
        }
        return axles * getTollFee();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Has trailer: " + hasTrailer);
    }

}