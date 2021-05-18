package test.lecture.chapter7;

import lecture.chapter7.Hotel;
import org.junit.jupiter.api.function.Executable;

public class NotEnougFreeSlotsInHotelExecution implements Executable {


    @Override
    public void execute() throws Throwable {
        int freeSlots = 100;
        Hotel myHotel = new Hotel(freeSlots);

        myHotel.bookSlots(freeSlots + 1);
    }
}
