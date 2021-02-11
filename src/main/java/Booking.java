public class Booking {

    private int nightsBooked;
    private Bedroom roomBooked;

    public Booking(int nightsBooked, Bedroom roomBooked){
        this.nightsBooked = nightsBooked;
        this.roomBooked = roomBooked;
    }

    public int totalBill(){
        return this.nightsBooked * roomBooked.getNightlyRate();
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }

    public Bedroom getRoomBooked() {
        return this.roomBooked;
    }
}
