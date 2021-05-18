package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class Bus implements Bookable{

    public int freeSlot() {
        return 0;
    }


    public void bookSlots(int slots) throws NotEnoughFreeSlotsException {
        throw new NotEnoughFreeSlotsException(slots, freeSlot());
    }
}
