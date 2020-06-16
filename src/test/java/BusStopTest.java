import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Person person;

    @Before
    public void before() {
        busstop = new BusStop("Lothian Road");
    }

    @Test
    public void busstopHasName() {
        assertEquals("Lothian Road", busstop.getBusStopName());
    }
}
