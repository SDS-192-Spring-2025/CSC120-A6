import java.util.ArrayList;
public class Car{ 
    private ArrayList<Passenger> passengers; 
    private final int maxCapacity; 
    /**
     * constructor
     * @param maximum capacity
     */
    public Car(int maxCapacity){ 
        this.passengers = new ArrayList<>(); 
        this.maxCapacity = maxCapacity; 
    } 
     /**
     * getter
     * @return the maximum capatity
     */
    public int getCapacity(){
         return maxCapacity;
    } 
     /**
     * setter
     * @return the number of seatsRemaining 
     */
    public int seatsRemaining(){
        int seatsRemaining;
        seatsRemaining= maxCapacity - passengers.size(); 
         return seatsRemaining;
    } 
     /**
     * @return adds the passengers when the condition is met, otherwise returns false.
     */
    public boolean addPassenger(Passenger p){ 
        if(passengers.contains(p)){
            System.out.println("Passenger is already in the car");
            return false;
        }
        if(passengers.size() < maxCapacity){
            passengers.add(p);
            System.out.println("Added a passenger to the car");
            return true;
        } 
        else{
            System.out.println("Can't add a passenger to a full car. Try another one");
            return false;
        }

    } 
     /**
     * removes the passengers when the condition is met, otherwise returns false.
     */
    public boolean removePassenger(Passenger p) { 
        if(passengers.contains(p)) {
            passengers.remove(p);
            System.out.println("Passenger removed ");
            return true;
        } 
        else {
            System.out.println("\nThis passenger is not found in this car\n");
            return false;
        }

    } 

    public void printManifest(){ 
        if (passengers.isEmpty()) { 
            System.out.println("This car is empty."); 
        } 
        else { 
            for (Passenger passenger : passengers){ 
                System.out.println("Passenger: " + passenger.getName()); 
            } 
        } 
    } 
}
