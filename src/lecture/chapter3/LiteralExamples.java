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


        // long Literal
        long bigNumber = 3000000000l;


        /*
        Gleitkommaliterale
         */

        double numberB = .5;    // --> 0,5

        numberB = 5.67;
        numberB = 5.67e2;       // --> 5,67 * 10^2 --> 567,0
        System.out.println(numberB);
        numberB = -6.67e-3;     // --> -6,67 * 10^-3 --> 0,00667
        System.out.println(numberB);

        numberB = 3.14e2d; // d --> double (standard)
        numberB = 3.14e2f; // f --> float


        float numberC = 3.14f;


        /*
        Boolean-Literal
         */

        boolean isTired = true; // false

        /*
        Char-Literal
         */

        char oneSign = 'h';     // Start und Ende durch ' (einzelenes Hochkomma)
        System.out.println(oneSign);
        oneSign = '\u2764';
        System.out.println(oneSign);

        oneSign = 77;
        System.out.println(oneSign);

        oneSign = '\t';

        /*
        Zeichenkettenliteral
         */

        String text = "Hier \tsteht ein \nlängerer \"Text!\" ❤ \u2764 --> Backslash \\";
        System.out.println(text);


        //text = "\t";
        int signCount = text.length();
        System.out.println(signCount);







    }
}
