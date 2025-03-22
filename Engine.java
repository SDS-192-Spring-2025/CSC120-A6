public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private final double maxCapacity;

    /**
     * getter
     * @return the engine's full fuel capacity
     */
    public double getMaxFuel() {
        return maxCapacity;
    }

    /**
     * getter
     * @return the current fuel level in the engine
     */
    public double getCurrentFuel() {
        return currentFuelLevel;
    }

    /**
     * getter
     * @return what fuel the engine uses
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * setter
     * @param fuelType
     * changes what fuel the engine uses
     */
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * setter
     * @param currentFuelLevel
     * Updates the fuel level
     */
    public void setCurrentFuelLevel(double FuelLevelNow) {
        this.currentFuelLevel = FuelLevelNow;
    }

    /**
     * constructor
     * @param fuel
     * @param currentFuelLevel
     * @param EngineCapacity
     * Passing the values of the varibles into the constructor.
     */
    public Engine(FuelType fuelType, double currentFuelLevel, double maxCapacity) {
        this.fuelType=fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxCapacity=maxCapacity;
    }

    /**
     * Fills the engine to the maximum capacity
     */
    public void refuel(){
        this.currentFuelLevel = maxCapacity;
    }

    /**
     * Updates fuel after every trip
     * @return True if the engine has enough fuel to start, false otherwise
     */
    public boolean go(){
        if(currentFuelLevel > 0){
            System.out.println("Choo choo! Safe travels!");
            int gallonPerTrip= 5;
            this.currentFuelLevel -= gallonPerTrip;
            return true;
           
        }else{
            System.out.println("The Engine is out of fuel. Need a refill!");
            return false;
        }
    }
}