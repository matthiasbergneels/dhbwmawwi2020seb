package lecture.chapter7;

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

    public boolean bookSlots(int slots){
        if(freeSlot() < slots){
            return false;
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
        return true;
    }
}
