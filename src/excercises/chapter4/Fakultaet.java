package excercises.chapter4;

public class Fakultaet {

    public static void main(String[] args) {

        int fakultaet = UserInput.returnUserInputAsInteger("Berechne Fakultät von: ");
        int result = 1;

        while(fakultaet > 0){
            result = result * fakultaet--;
            // Alternativ: result *= fakultaet--;
            //fakultaet--;
        }

        System.out.println("Die Fakultät beträgt: " + result);
    }
}
