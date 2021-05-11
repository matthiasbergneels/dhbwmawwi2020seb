package excercises.chapter7;

public class Airplane implements Bookable{

    private boolean seats[];

    public Airplane(int seatCount){
        seats = new boolean[seatCount];
    }

    public void fly(){
        System.out.println("und ich flieg, flieg, flieg... ");
    }

    public int freeSlots(){
        int freeSeats = 0;
        for(boolean seat : seats){
            if(!seat){
                freeSeats++;
            }
        }
        return freeSeats;
    }

    public boolean bookSlots(int slots){
        if(freeSlots() < slots){
            return false;
        }

        for(int i=0; i < seats.length; i++){
            if(!seats[i]){
                seats[i] = true;
                slots--;
            }

            if(slots == 0){
                break;
            }
        }
        return true;
    }
}
