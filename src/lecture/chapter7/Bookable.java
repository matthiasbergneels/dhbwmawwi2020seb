package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public interface Bookable {

    public int freeSlot();
    public void bookSlots(int slots) throws NotEnoughFreeSlotsException;
    public default boolean unbookSlots(int slots){
        return false;
    }

}
