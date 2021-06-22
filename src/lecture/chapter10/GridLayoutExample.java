package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    private GridLayoutExample(){
        this.setTitle("GridLayout Example");

        this.setLayout(new GridLayout(0,2));

        this.add(new JLabel("Feld 1:"));
        JPanel cellPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel.add(new JTextField(10));
        this.add(cellPanel);
        this.add(new JLabel("Feld 2:"));
        cellPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel.add(new JTextField(5));
        this.add(cellPanel);
        this.add(new JLabel("Feld 3:"));
        cellPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel.add(new JTextField(7));
        this.add(cellPanel);
        this.add(new JLabel("Feld 4:"));
        cellPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel.add(new JTextField(10));
        this.add(cellPanel);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }

}
