import java.util.ArrayList;
public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;
    public int maxCapacity;
    /**
     * Getter
     * @return an instance of the engine class.
     */
    public Engine getEngine(){
        return engine;
    }
    /**
     * Constructor
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param maxCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int maxCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.cars = new ArrayList<>();
        this.maxCapacity = maxCapacity;
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(maxCapacity));
        }
    }
    /**
     * 
     * @return cars 
     */
    public ArrayList<Car> getCars() {
        return cars;
    }
    /**
     * 
     * @param i
     * @return the car at the "i" position in the car arraylist 
     */
    public Car getCar(int i) {
        return cars.get(i);
    }
    /**
     * getter
     * @return the train passenger capacity
     */
    public int getMaxCapacity(){
        int trainCapacity = 0;
        for (Car car : cars){
            trainCapacity += car.getCapacity();
        }
        return trainCapacity;
    }
    /**
     * 
     * @return Seats remaining. 
     */
    public int seatsRemaining() {
        int seatsRemaining = 0;
        for (Car car : cars) {
            seatsRemaining += car.seatsRemaining();
        }
        return seatsRemaining;
    }
    /**
     * prints out the manifest of the train. 
     */
    public void printManifest() {
        System.out.println("\nThe Manifest");
        if (cars.isEmpty()){
            System.out.println("No cars attached to this train.");
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("\nPassenger list for Car " + (i + 1) + ":");
            cars.get(i).printManifest();
        }
    }
 
    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 3, 50);
 
        Passenger p1 = new Passenger("Hayle");
        Passenger p2 = new Passenger("Ben");
        Passenger p3 = new Passenger("Fatima");
 
        // Add passengers to cars at "i" position 
        myTrain.getCar(0).addPassenger(p1);
        myTrain.getCar(0).addPassenger(p2);
        myTrain.getCar(2).addPassenger(p3);
 
        // Print train manifest
        myTrain.printManifest();
        System.out.println("");
 
        if (myTrain.getEngine().go()){
            System.out.println("Choo choo!");
        }
        else{
            System.out.println("Out of fuel. Please refill.");
        }
        myTrain.getCar(1).removePassenger(p3);
        myTrain.getCar(0).addPassenger(p1);
        System.out.println("");
    }
 }
 