package lecture.chapter10;

import javax.swing.*;

public class MyFirstUI {

    public static void main(String[] args) {

        JFrame myFrame = new JFrame("My first UI");

        myFrame.add(new JLabel("Hello World!"));
        myFrame.add(new JButton("Los gehts"));

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);

        System.out.println("Jetzt ist mein UI gestartet");

    }
}
