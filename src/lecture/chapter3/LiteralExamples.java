package lecture.chapter3;

public class LiteralExamples {

    public static void main(String[] args) {


        /*
        Ganzzahlenliteral
        */
        
        // Dezimalliteral - Ziffern von 0 - 9
        int numberA = 42;
        System.out.println(numberA); // Ausgabe: 42

        // Oktalliteral - Prefix 0; Ziffern von 0 - 7
        numberA = 071;
        System.out.println(numberA); // Ausgabe: 57 (Rechnung: 7 * 8^1 + 1 * 8^0)

        // Hexaliteral - Prefix 0x; Ziffern von  0-9 & Zeichen A-F
        numberA = 0x6A3; // RGB FFFFFF
        System.out.println(numberA); // Ausgabe: 1699 (Rechnung: 6 * 16^2 + A (10) * 16^1 + 3 * 16^0)

    }
}
