package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class TravelAgency {

    public static void main(String[] args){

        Airplane myAirplane = new Airplane(100);

        myAirplane.fly();

        System.out.println("Freie Plätze in myAirplane: " + myAirplane.freeSlot());

        try {
            myAirplane.bookSlots(10);
        }catch(NotEnoughFreeSlotsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("10 Plätze gebucht: verbleibende freie Plätze: " + myAirplane.freeSlot());


        System.out.println("Entspricht myAirplane dem Bookable Interface? " + (myAirplane instanceof Bookable));

        Bookable[] canBeBooked = new Bookable[5];
        // narrowing Cast!
        canBeBooked[0] = myAirplane;
        canBeBooked[1] = new Hotel(100);
        canBeBooked[2] = new Hotel(15);
        canBeBooked[3] = new Airplane(500);
        canBeBooked[4] = new Bus();

        for(int i = 0; i < canBeBooked.length; i++) {
            System.out.println("==== Bookable Object - Index " + i);
            System.out.println("Freie Plätze: " + canBeBooked[i].freeSlot());
            try {
                canBeBooked[i].bookSlots(25);
            }catch(NotEnoughFreeSlotsException e){
                System.out.println(e.getMessage());
                System.out.println("Wir buchen die verbleibenden freie Plätze: " + e.getFreeSlots());
                try {
                    canBeBooked[i].bookSlots(e.getFreeSlots());
                }catch (NotEnoughFreeSlotsException e1) {
                    System.out.println("Jetzt weiss ich auch nicht weiter! ");
                    return;
                }
            }
            System.out.println("Buchung erfolgreich! Verbleibende freie Plätze: " + canBeBooked[i].freeSlot());

            canBeBooked[i].unbookSlots(50);

            if(canBeBooked[i] instanceof Airplane){
                // widening Cast
                ((Airplane)canBeBooked[i]).fly();
            }
        }
    }
}
