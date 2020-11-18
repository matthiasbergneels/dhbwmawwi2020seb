package lecture.chapter4;

public class IfExample {

    public static void main(String[] args) {

        int numberA = 110;
        int numberB = 65;

        if ( numberA > numberB ) {
            System.out.println("NumberA ist größer!");
            System.out.println("NumberB ist kleiner!");
        }else if(numberA == numberB){
            System.out.println("NumberA und NumberB sind gleich!");
        } else {
            System.out.println("NumberB ist größer!");
        }


        if(numberA > 100) {
            System.out.println("NumberA größer als 100");
        }else if(numberA > 50 && numberA < 150){
            System.out.println("NumberA zwischen 50 und 150");
        }else{
            System.out.println("NumberA kleiner gleich 50");
        }


        System.out.println("Ende");

    }
}
