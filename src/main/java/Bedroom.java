public class Bedroom extends Room {

    private String roomNumber;
    private RoomType roomType;
    private int nightlyRate;

    public Bedroom(int capacity, String roomNumber, RoomType roomType){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public String getRoomNumber(){
        return this.roomNumber;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public void setNightlyRate(int rate){
        this.nightlyRate = rate;
    }

    public int getNightlyRate(){
        return this.nightlyRate;
    }

//    public void checkInToRoom(Guest guest, String roomNumber){

}
