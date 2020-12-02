package lecture.chapter5;

public class CallByValueVSReference {

    public static void main(String[] args) {

        // Call by Value - primitive Datentype

        int numberA = 10;
        int numberB;

        // Call by Value --> der aktuelle Wert wird übergeben
        // entspricht einer "Kopie" des Wertes
        numberB = numberA;


        numberA = numberA + 10;

        System.out.println(numberB);


        // Call by Reference --> komplexe (/referenz) Datentypen


        Person ourTeacher = new Person();

        ourTeacher.hitPerson();

        System.out.println("OurTeach hat blaues Auge: " + ourTeacher.isBlauesAuge());

        Person papa;
        Person hasiPupsi;

        // Call by Reference
        papa = ourTeacher;
        System.out.println("Papa hat blaues Auge: " + papa.isBlauesAuge());

        // Call by Reference
        hasiPupsi = ourTeacher;
        System.out.println("HasiPupsi hat blaues Auge: " + hasiPupsi.isBlauesAuge());
    }
}
