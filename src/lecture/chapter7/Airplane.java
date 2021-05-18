package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class Airplane implements Bookable{

    private boolean bookedSeat[];

    public Airplane(int seatCount){
        bookedSeat = new boolean[seatCount];
    }

    public void fly(){
        System.out.println("und ich flieg, flieg, flieg... ");
    }

    public int freeSlot(){
        int freeSeats = 0;
        for(boolean seat : bookedSeat){
            if(!seat){
                freeSeats++;
            }
        }
        return freeSeats;
    }

    public void bookSlots(int slots) throws NotEnoughFreeSlotsException {
        if(freeSlot() < slots){
            throw new NotEnoughFreeSlotsException(slots, freeSlot());
        }

        for(int i = 0; i < bookedSeat.length; i++){
            if(!bookedSeat[i]){
                bookedSeat[i] = true;
                slots--;
            }

            if(slots == 0){
                break;
            }
        }
    }
}
