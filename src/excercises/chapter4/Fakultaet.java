package excercises.chapter4;

import javax.swing.JOptionPane;

public class Fakultaet {

    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Geben Sie eine Zahl ein:");

        int fakultaet = Integer.parseInt(userInput);
        int result = 1;

        while(fakultaet > 0){
            result = result * fakultaet--;
            // Alternativ: result *= fakultaet--;
            //fakultaet--;
        }

        System.out.println("Die Fakultät beträgt: " + result);
    }
}
