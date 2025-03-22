public class Passenger {
    String name;

    /**
     * constructor
     * @param nameOfPassenger gets the name of the passenger
     * 
     */
    public Passenger(String nameOfPassenger) {
        this.name = nameOfPassenger;
    }

    /**
     * adds passenger to the car
     * @param c, the car the passenger is boarding
     */
    public void boardCar(Car c){
        var newPassenger= new Passenger( name);
        c.addPassenger(newPassenger);
    }

    /**
     * removes passenger from the car
     * @param c, The car the passenger is getting off 
     */
    public void getOffCar(Car c){
        var availablePassenger= new Passenger( name);
        c.removePassenger(availablePassenger);

    }
}