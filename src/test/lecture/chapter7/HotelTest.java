package test.lecture.chapter7;

import lecture.chapter7.Hotel;
import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void bookSlotThrowsNotEnoughSlotsException(){
        NotEnoughFreeSlotsException myNotEnoughFreeSlotsException = assertThrows(NotEnoughFreeSlotsException.class, new NotEnougFreeSlotsInHotelExecution());
        assertEquals(100, myNotEnoughFreeSlotsException.getFreeSlots());
    }

    @Test
    void bookSlotThrowsNotEnoughSlotsExceptionWithAnonymousClass(){
        int slots = 100;

        NotEnoughFreeSlotsException myNotEnoughFreeSlotsException =
                assertThrows(NotEnoughFreeSlotsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Hotel myHotel = new Hotel(slots);
                myHotel.bookSlots(slots+1);
            }
        });
        
        assertEquals(slots, myNotEnoughFreeSlotsException.getFreeSlots());
    }

    @Test
    void bookSlotThrowsNotEnoughSlotsExceptionWithLambdaFunction(){
        int slots = 100;

        NotEnoughFreeSlotsException myNotEnoughFreeSlotsException =
                assertThrows(NotEnoughFreeSlotsException.class, () -> {
                    Hotel myHotel = new Hotel(slots);
                    myHotel.bookSlots(slots+1);
                });

        assertEquals(slots, myNotEnoughFreeSlotsException.getFreeSlots());
    }

}