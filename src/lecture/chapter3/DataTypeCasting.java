package lecture.chapter3;

public class DataTypeCasting {

    static int numberB;

    public static void main(String[] args) {

        byte smallNumber = 15;
        int biggerNumber;

        // impliziter Type-Cast (cast von byte nach int)
        biggerNumber = smallNumber;
        System.out.println(biggerNumber);

        // expliziter Type-Cast (cast von int nach byte) --> type cast operator (<type>)
        smallNumber = (byte)biggerNumber;
        System.out.println(smallNumber);

        biggerNumber = 129;
        smallNumber = (byte)biggerNumber;
        System.out.println(smallNumber);


        // Exkurs - Initialwerte von Datetypen
        int numberA = 0;

        System.out.println(numberA);
        System.out.println(numberB);

        /*
        Initialwerte:
        Ganzzahlen: 0
        Gleitkommazahlen: 0.0
        String: ""
        Boolean: false
        Referenztypen: null
         */



    }
}
