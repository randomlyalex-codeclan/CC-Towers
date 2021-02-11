import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;


    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(10, "5", RoomType.DOUBLE);
        hotel.addBedroomToHotel(bedroom);
    }

    @Test
    public void canFindRoomByRoomNumber(){
        assertEquals(bedroom, hotel.findBedroomByRoomNumber("5"));
    }

    @Test
    public void wrongRoomByRoomNumberReturnsNull(){
        assertEquals(null, hotel.findBedroomByRoomNumber("6"));
    }
}
