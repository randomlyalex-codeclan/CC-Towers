import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(10, "5", RoomType.DOUBLE);
        bedroom.setNightlyRate(100);
        booking = new Booking(4, bedroom);
    }

    @Test
    public void bookingHasNumberOfNights() {
        assertEquals(4, booking.getNightsBooked());
    }

    @Test
    public void bookingHasABedroom() {
        assertEquals(bedroom, booking.getRoomBooked());
    }


    @Test
    public void bookingHasATotalBill() {
        assertEquals(400, booking.totalBill());
    }
}
