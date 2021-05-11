package excercises.chapter7;

public interface Bookable {

    public int freeSlots();
    public boolean bookSlots(int slots);
    public default boolean unbookSlots(int slots){
        return false;
    }
}
