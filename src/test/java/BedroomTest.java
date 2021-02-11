import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(10, "5", RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals("5", bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, bedroom.getCapacity());
    }

    @Test
    public void hasRoomTypeDouble(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

}
