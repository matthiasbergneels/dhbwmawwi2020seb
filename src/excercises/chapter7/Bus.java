package excercises.chapter7;

public class Bus implements Bookable{



    @Override
    public int freeSlots() {
        return 0;
    }

    @Override
    public boolean bookSlots(int slots) {
        return false;
    }
}
