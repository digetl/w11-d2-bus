import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("E39", "Edinburgh", 10);
        person = new Person();
    }

    @Test
    public void hasName(){
    assertEquals("E39", bus.getName());
    }

    @Test
    public void busHasDestination(){
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void busIsEmpty() {
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void addPassengerToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }

}
