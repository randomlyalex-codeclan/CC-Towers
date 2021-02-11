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

    public void checkGuestIntoBedroom(Guest guest, String roomNumber){
        Bedroom bedroom;
        bedroom = findBedroomByRoomNumber(roomNumber);
        bedroom.addGuestToRoom(guest);
    }
}
