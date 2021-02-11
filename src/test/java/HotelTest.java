import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Guest guest;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(10, "5", RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(10, "Barra");
        hotel.addConferenceRoomToHotel(conferenceRoom);
        hotel.addBedroomToHotel(bedroom);
        guest = new Guest("Steve");

    }

    @Test
    public void canFindBedroomByRoomNumber(){
        assertEquals(bedroom, hotel.findBedroomByRoomNumber("5"));
    }

    @Test
    public void wrongBedroomByRoomNumberReturnsNull(){
        assertEquals(null, hotel.findBedroomByRoomNumber("6"));
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel.checkGuestInOutOfBedroom(guest, "5");
        assertEquals(1,bedroom.getGuestCount());
    }

    @Test
    public void canCheckGuestOutBedroom(){
        hotel.checkGuestInOutOfBedroom(guest, "5");
        hotel.checkGuestInOutOfBedroom(guest, "5");
        assertEquals(0,bedroom.getGuestCount());
    }


    @Test
    public void canFindConferenceRoomByRoomName(){
        assertEquals(conferenceRoom, hotel.findConferenceRoomByName("Barra"));
    }

    @Test
    public void wrongConferenceRoomByNameReturnsNull(){
        assertEquals(null, hotel.findConferenceRoomByName("notBarra"));
    }

    @Test
    public void canCheckGuestIntoeConfernceRoom(){
        hotel.checkGuestInOutOfConferenceRoom(guest, "Barra");
        assertEquals(1,conferenceRoom.getGuestCount());
    }

    @Test
    public void canCheckGuestOutConferenceRoom(){
        hotel.checkGuestInOutOfConferenceRoom(guest, "Barra");
        hotel.checkGuestInOutOfConferenceRoom(guest, "Barra");
        assertEquals(0,conferenceRoom.getGuestCount());
    }

    @Test
    public void canTakeBooking(){
        Booking booking;
        bedroom.setNightlyRate(100);
        booking = hotel.bookRoom(bedroom, 4);
        assertEquals(400, booking.totalBill());
    }

}
