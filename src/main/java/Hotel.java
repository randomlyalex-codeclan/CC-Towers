import java.beans.beancontext.BeanContext;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom>bedRoomsList;
    private ArrayList<ConferenceRoom>conferenceRoomList;

    public Hotel(){
        this.bedRoomsList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<ConferenceRoom>();
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedRoomsList.add(bedroom);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom){
        this.conferenceRoomList.add(conferenceRoom);
    }

    //Consider Casting to stop the repitition below:


    public Bedroom findBedroomByRoomNumber(String roomNumber) {
        Bedroom foundRoom;
        foundRoom = null;
        for (Bedroom bedroom : bedRoomsList) {
            if (bedroom.getRoomNumber() == roomNumber) {
                foundRoom = bedroom;
            }
        }
        return foundRoom;
    }

    public void checkGuestInOutOfBedroom(Guest guest, String roomNumber){
        Bedroom bedroom;
        bedroom = findBedroomByRoomNumber(roomNumber);
        if (bedroom != null) {
            bedroom.addOrRemoveGuestToRoom(guest);
        }
    }

    public ConferenceRoom findConferenceRoomByName(String roomName) {
        ConferenceRoom foundRoom;
        foundRoom = null;
        for (ConferenceRoom conferenceRoom : conferenceRoomList) {
            if (conferenceRoom.getName() == roomName) {
                foundRoom = conferenceRoom;
            }
        }
        return foundRoom;
    }

    public void checkGuestInOutOfConferenceRoom(Guest guest, String roomName){
        ConferenceRoom conferenceRoom;
        conferenceRoom = findConferenceRoomByName(roomName);
        if (conferenceRoom != null) {
            conferenceRoom.addOrRemoveGuestToRoom(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int nightsBooked){
        Booking booking;
        booking = new Booking(nightsBooked, bedroom);
        return booking;
    }
}
