package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    private BorderLayoutExample(){
        this.setTitle("BorderLayout Example");

        this.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(new JButton("Center"));

        this.add(centerPanel, BorderLayout.CENTER);
        this.add(new JButton("Norden"), BorderLayout.NORTH);
        this.add(new JButton("Süden"), BorderLayout.SOUTH);
        this.add(new JButton("Osten"), BorderLayout.EAST);
        this.add(new JButton("Westen"), BorderLayout.WEST);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
