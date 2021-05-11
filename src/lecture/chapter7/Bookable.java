package lecture.chapter7;

public interface Bookable {

    public int freeSlot();
    public boolean bookSlots(int slots);
    public default boolean unbookSlots(int slots){
        return false;
    }

}
