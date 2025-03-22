import static org.junit.Assert.*;
import org.junit.Test;

public class TrainTest {

    @Test
    public void testEngineConstructor() {
        fail();
    }

    @Test
    public void testEngineGo() {
        if (!engine.go()) { 
            fail("Engine should be able to go if fuel is available.");
        }
        assertEquals(45.0, engine.getCurrentFuel(), "Fuel level should decrease by 5 after go() call.");
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        fail();
    }

    @Test
    public void testCarRemovePassenger() {
        fail();
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        fail();
    }

    @Test
    public void testPassengerBoardCarFull() {
        fail();
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        fail();
    }

    @Test
    public void testTrainPassengerCount() {
        fail();
    }

    @Test
    public void testTrainGetCar() {
    if (train.getCar(5) != null) { 
        fail("getCar(5) should return null because there are only 3 cars.");
    }
}

    }

    @Test
    public void testTrainPrintManifest() {
        fail();
    }
    
}
