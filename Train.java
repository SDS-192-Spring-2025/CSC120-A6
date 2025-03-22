import java.util.ArrayList;
import java.util.Scanner;
public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    /**
     * getter
     * @return the type of engine being used by the train
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * constructor
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = getEngine();
        this.cars = new ArrayList<>();
    }
    /**
     * getter
     * @return information about all the train's cars
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * adds a new car to the train, returns the updated train's cars
     * @param car
     * @param cars
     * @return
     */
    public ArrayList<Car> addCar(Car car, ArrayList<Car> cars) {
        cars.add(car);
        return cars;
    }

    /**
     * getter
     * @param i
     * @return the car at index i
     */
    public Car getCar(int i) {
        return cars.get(i);
    }
    /**
     * getter
     * @return the combined capacity of the train's cars
     */
    public int getMaxCapacity() {
        int trainCapacity = 0;
        for (Car car : cars) {
            trainCapacity += car.getCarCapacity();
        }
        return trainCapacity;
    }

    /**
     *
     * @return how many seats are free in the whole train
     */
    public int seatsRemaining() {
        int seatsremaining = 0;
        for (Car car : cars) {
            seatsremaining += car.seatsRemaining();
        }
        return seatsremaining;
    }

    /**
     * prints each car's information
     * @param cars
     */
    public void printManifest(ArrayList<Car> cars) {
        for (Car car : cars) {
            car.printManifest();
        }
    }

    /**
     * Demonstrates the integration of the car, engine, and passenger classes
     * @param args The command line arguments (ignored)
     **/
    public static void main(String[] args) {
        String nameOfThePassenger;
        int numGettingIn;
        Scanner sc= new Scanner(System.in);
        System.out.println("___________________________________________________________________");
        System.out.println("******* Welcome to the train! ********");
        System.out.println("");
        System.out.println("How many passengers want to get on?");
        numGettingIn=sc.nextInt();
        ArrayList<Passenger> passengers = new ArrayList<>();
        for(int i=0; i<numGettingIn;i++){
            System.out.print("Please input the name of the Passenger ");
            nameOfThePassenger=sc.next();
            var newPassenger = new Passenger(nameOfThePassenger);
            passengers.add(newPassenger);
        }

        Engine engine = new Engine(FuelType.ELECTRIC, 0, 40);
        Car c = new Car(passengers);
        //Train t = new Train(FuelType.ELECTRIC, 40, 3, 100);
        c.printManifest();
        System.out.println("");
        c.seatsRemaining();
        engine.go();
       /*  String answer;
        answer=sc.next();
        System.out.println("Does a passenger want to get off?"+answer );
        if(answer.equals("yes")){
            System.out.println("Which passenger? ");
            nameOfThePassenger=sc.next();
        }*/
        
        sc.close();
        System.out.println("___________________________________________________________________");
    }
}