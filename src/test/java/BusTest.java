import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("E39");
    }

    @Test
    public void hasName(){
    assertEquals("E39", bus.getName());
        }

}
