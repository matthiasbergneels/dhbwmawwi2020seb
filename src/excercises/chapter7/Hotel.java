package excercises.chapter7;

public class Hotel implements Bookable{

    private int roomCount;
    private int bookedRoomCount;

    public Hotel(int roomCount){
        this.roomCount = roomCount;
        this.bookedRoomCount = 0;
    }

    public void clean(){
        System.out.println("und ich wisch, wisch, wisch...");
    }


    @Override
    public int freeSlots() {
        return this.roomCount - this.bookedRoomCount;
    }

    @Override
    public boolean bookSlots(int slots) {
        if(freeSlots() >= slots){
            bookedRoomCount += slots;
            return true;
        }

        return false;
    }
}
