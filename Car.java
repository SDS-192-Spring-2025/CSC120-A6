import java.util.ArrayList;
public class Car {
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private final int carCapacity=100;

    /**
     * constructor
     * @param passengers
     */
    public Car(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    /**
     *
     * @return carCapacity the maximum number of passengers the car can hold
     */
    public int getCarCapacity() {
        return carCapacity;
    }

    /**
     *
     * @return information about passengers who are in the car
     */
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    /**
     *
     * @return the number of free seats; the car capacity minus the number of current passengers
     */
    public int seatsRemaining() {
        int seatsRemaining=getCarCapacity() - passengers.size();
        System.out.println("The number of seats remaining is: "+seatsRemaining);
        return seatsRemaining ;
    }

    /**
     *
     * @param passengers
     * @return T/F Does the car have extra seats?
     */
    public boolean carSpaceAvailable(ArrayList<Passenger> passengers) {
        if(carCapacity==passengers.size()){
            System.out.println("Car is full!");
            return false;
        }else{
            if(passengers.size()<carCapacity || passengers.isEmpty()) {
                System.out.println("Car has space!");
            }
            return true;
        }
    }
    public boolean addPassenger(Passenger passenger) {
        if (carSpaceAvailable(passengers) && !passengers.contains(passenger)) {
            passengers.add(passenger);
            return true;
        }else {
            return false;
        }
    }
    public boolean removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)){ 
            passengers.remove(passenger);
            return true;
        }else {
            return false;
        }
    }
    public void printManifest(){
        int i=0;
        if(!passengers.isEmpty()) {
            System.out.println(" ");
            System.out.println("The Manifest");
            System.out.println("");
            for (Passenger passenger : passengers) {
                System.out.println("passenger "+i+": "+passenger.name);
                i++;
            }
        }else{
            System.out.println("Car is empty!");
        }
    }
}
