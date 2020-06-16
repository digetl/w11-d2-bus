import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Person person;

    @Before
    public void before() {
        busstop = new BusStop("Lothian Road");
        person = new Person();
    }

    @Test
    public void busstopHasName() {
        assertEquals("Lothian Road", busstop.getBusStopName());
    }

    @Test
    public void BusStopIsEmpty() {
        assertEquals(0, busstop.lengthOfQueue());
    }

    @Test
    public void AddPassengerToQueue() {
        busstop.addPassengerToQueue(person);
        assertEquals(1, busstop.lengthOfQueue());
    }

    @Test
    public Person removePassengerFromQueue() {
        busstop.addPassengerToQueue(person);
        Person personRemoved = busstop.removePassengerFromTheQueue();
        assertEquals(0, busstop.lengthOfQueue());
        return personRemoved;
    }

}
