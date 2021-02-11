import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Guest> getGuests(){
        return this.guests;
    }

    public void addOrRemoveGuestToRoom(Guest guest){
        if (this.guests.contains(guest)){
            this.guests.remove(guest);
        }
        else this.guests.add(guest);
    }

    public int getGuestCount(){
        return this.guests.size();
    }

}
