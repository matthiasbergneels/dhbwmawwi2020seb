package excercises.chapter7;

public class TravelAgency {

    public static void main(String[] args) {

        Airplane myAirplane = new Airplane(100);

        myAirplane.fly();

        System.out.println("Freie Plätze in myAirplane: " + myAirplane.freeSlots());
        boolean bookingResult = myAirplane.bookSlots(10);
        System.out.println("10 Plätze gebucht: " + bookingResult + " - verbleibende freie Plätze: " + myAirplane.freeSlots());


        Bookable[] canBeBooked = new Bookable[5];
        canBeBooked[0] = myAirplane;
        canBeBooked[1] = new Hotel(100);
        canBeBooked[2] = new Hotel(15);
        canBeBooked[3] = new Airplane(500);
        canBeBooked[4] = new Bus();

        for(int i = 0; i < canBeBooked.length; i++) {
            System.out.println("==== Bookable Object - Index " + i);
            System.out.println("Freie Plätze: " + canBeBooked[i].freeSlots());
            bookingResult = canBeBooked[i].bookSlots(25);
            System.out.println("Buchung erfolgreich? " + bookingResult + " - verbleibende freie Plätze: " + canBeBooked[i].freeSlots());
        }
    }
}