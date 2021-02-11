import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(10, "5", RoomType.DOUBLE);
        guest = new Guest("Steve");
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

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canCheckGuestIntoRoom(){
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

}