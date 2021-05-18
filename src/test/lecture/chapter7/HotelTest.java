package test.lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void bookSlotThrowsNotEnoughSlotsException(){
        NotEnoughFreeSlotsException myNotEnoughFreeSlotsException = assertThrows(NotEnoughFreeSlotsException.class, new NotEnougFreeSlotsInHotelExecution());
        assertEquals(100, myNotEnoughFreeSlotsException.getFreeSlots());
    }

}