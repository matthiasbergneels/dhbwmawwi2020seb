package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

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
    public int freeSlot() {
        return this.roomCount - this.bookedRoomCount;
    }

    @Override
    public void bookSlots(int slots) throws NotEnoughFreeSlotsException {
        if(freeSlot() < slots){
            NotEnoughFreeSlotsException myNotEnoughFreeSlotsException = new NotEnoughFreeSlotsException(slots, freeSlot());
            throw myNotEnoughFreeSlotsException;
        }

        bookedRoomCount += slots;
    }
}
