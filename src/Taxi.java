public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate,
                double tollFee,
                int passengers,
                boolean electric,
                double fareCollected){

        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected(){
        return  fareCollected;
    }

    public void pickupRiders(int numRiders, double farePerRider){

        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if(getPassengers() >= 4 && !isDiscountApplied()){
            setTollFee(getTollFee()*0.5);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        int passengers = getPassengers() -1;
        fareCollected += farePerRider * passengers;
        return dropOffPassengers(passengers);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Total Fare Collected: " + fareCollected);
    }

    @Override
    public void honk(){
        System.out.println("BEEP!!!");
    }
}
