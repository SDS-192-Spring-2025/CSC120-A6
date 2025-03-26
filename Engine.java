public class Engine { 
    private FuelType FuelType; 
    private double currentFuelLevel; 
    private final double maxCapacity; 
    
     /**
     * constructor
     * @param fuel
     * @param currentFuelLevel
     * @param EngineCapacity
     * Passing the values of the varibles into the constructor.
     */
    public Engine(FuelType fuelType, double currentFuelLevel, double maxCapacity){ 
        this.FuelType = fuelType; 
        this.currentFuelLevel = currentFuelLevel; 
        this.maxCapacity = maxCapacity; 
    } 
     /**
     * getter
     * @return The fuel type
     */
    public FuelType getFuelType(){
         return FuelType;
    } 
     /**
     * getter
     * @return maximum fuel capacity of the Engine
     */

    public double getMaxFuel(){
        return maxCapacity;
    } 
     /**
     * getter
     * @return the current fuel level
     */
    public double getCurrentFuel(){
         return currentFuelLevel; 
    } 
     /**
     * Method to refill the engine
     */
    public void refuel(){
         currentFuelLevel = maxCapacity;
    } 
     /**
     * Method to start the engine.
     */
    public Boolean go(){ 
        //final int gallonPerTrip = 5;
        if (currentFuelLevel > 0) { 
            //currentFuelLevel = currentFuelLevel - gallonPerTrip; 
            System.out.println("The current fuel level is: " + currentFuelLevel); 
            return true; 
        } 
        else
        {
            return false; 
        }
    } 
}
