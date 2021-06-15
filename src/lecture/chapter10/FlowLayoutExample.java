package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    private FlowLayoutExample(){
        this.setTitle("FlowLayout Example");

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.add(new JLabel("Hello World"));
        this.add(new JButton("Los gehts"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
