package lecture.chapter4;

public class OperatorExamples {

    public static void main(String[] args) {

        // arithmentische Operatoren

        int numberA = 10;
        int numberB = 4;

        int result;

        result = numberA + numberB; // --> result = 14

        result = numberA % numberB; // --> result = 2

        // result = 2
        result++; // inkrement --> result = result + 1;
        System.out.println(result);

        // post inkrement --> result = result + 1;
        result++;

        // pre inkrement --> result = result + 1;
        ++result;


        // post inkrement
        result = numberA++ + numberB; //--> result = 14; numberA = 11; numberB = 4;
        /* äquivalent:
        result = numberA + numberB;
        numberA = numberA + 1;
         */

        System.out.println(result);
        System.out.println(numberA);
        System.out.println(numberB);

        // pre inkrement
        result = numberA + ++numberB; // --> result = 16; numberA = 11; numberB = 5;
        /* äquivalent:
        numberB = numberB + 1;
        result = numberA + numberB;
         */

        System.out.println(result);
        System.out.println(numberA);
        System.out.println(numberB);


        // logische Operatoren

        boolean isTired = true;
        boolean isAtHome = true;

        boolean isGoingToBed;

        isGoingToBed = isTired && isAtHome;
        System.out.println(isGoingToBed);

        /*
        & / &&  true    false
        true    true    false
        false   false   false
        */

        /*
        | / ||  true    false
        true    true    true
        false   true    false
        */

        /*
        ^       true    false
        true    false   true
        false   true    false
        */


        // Zuweisungsoperatoren

        numberA += numberB; // --> numberA = numberA + numberB;


        // ?-Operator

        String text = isTired ? "Ich bin müde" : "Ich bin nicht müde";
        System.out.println(text);

        text = (isTired && isAtHome) ? "Ich gehe ins Bett" : "Gehe ich feiern";
        System.out.println(text);


        String text1 = "Hello";
        String text2 = "World";

        String textResult;

        textResult = numberA + numberB + text1 + " " + text2 + numberA + numberB;

        System.out.println(textResult);


        // scope
        {
            int numberC = 5;
            int numberD = 10;

            int result2 = numberC + numberD + numberA;
        }

        // System.out.println(numberC); --> numberC außerhalb des Scopes (Sichtbarkeit)

    }
}
