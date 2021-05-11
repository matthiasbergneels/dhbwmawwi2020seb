package excercises.chapter7;

public class Bus implements Bookable{

    public int freeSlot() {
        return 0;
    }


    public boolean bookSlots(int slots) {
        return false;
    }
}
