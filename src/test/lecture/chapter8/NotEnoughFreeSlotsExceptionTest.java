package test.lecture.chapter8;

import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotEnoughFreeSlotsExceptionTest {

    @Test
    void createNotEnoughFreeSlotsException(){
        NotEnoughFreeSlotsException myNotEnoughFreeSlotsException = new NotEnoughFreeSlotsException(100, 50);
        assertEquals("Es wurde versucht 100 Plätze zu buchen; frei sind 50 Plätze.", myNotEnoughFreeSlotsException.getMessage());
        assertEquals(50, myNotEnoughFreeSlotsException.getFreeSlots());
    }

}