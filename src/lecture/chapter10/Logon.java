package lecture.chapter10;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame{

    private final String ACTION_COMMAND_CLOSE_EVENT = "CLOSE_EVENT";
    private final String ACTION_COMMAND_PRINT_EVENT = "PRINT_EVENT";

    public Logon() throws ParseException{
        this.setTitle("Logon");

        final String[] PROTOCOL_VALUE_HELP = {"FTP", "Telnet", "SMTP", "HTTP"};
        JComboBox<String> myComboBox = new JComboBox<>(PROTOCOL_VALUE_HELP);

        JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));
        portField.setColumns(3);

        myComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Item: " + e.getItem());
                System.out.println("Parameter: " + e.paramString());
                System.out.println("State change: " + e.getStateChange());

                JComboBox<String> eventSourceComboBox = (JComboBox<String>) e.getSource();


                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("Neu selektiert: " + e.getItem());
                    System.out.println(eventSourceComboBox.getSelectedItem());
                    System.out.println(myComboBox.getSelectedItem());

                    if(e.getItem().equals("HTTP")){
                        portField.setText("80");
                    }else if(e.getItem().equals("FTP")){
                        portField.setText("21");
                    }
                }
            }
        });



        // initialize Panels
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
        JPanel filePanel = new JPanel(new GridLayout(0, 2));

        FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

        //create & assign elements for connection area
        JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("User:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(3));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Passwort:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JPasswordField(5));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Art:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(myComboBox);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Host:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        JTextField host = new JTextField(5);
        flowLayoutForCell.add(host);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Port:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(portField);
        connectionPanel.add(flowLayoutForCell);

        // create & add Fields for File Area
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Quelle:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Ziel:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);

        // create & assign Buttons
        JButton okButton = new JButton("Ausgeben");
        okButton.setActionCommand(ACTION_COMMAND_PRINT_EVENT);
        JButton cancelButton = new JButton("Schliessen");
        cancelButton.setActionCommand(ACTION_COMMAND_CLOSE_EVENT);

        ActionListener buttonListener = (ActionEvent e) -> {
            System.out.println("Action Command: " + e.getActionCommand());
            System.out.println("Parameter: " + e.paramString());
            System.out.println("Modifiers: " + e.getModifiers());

            if(e.getActionCommand().equals(ACTION_COMMAND_CLOSE_EVENT)){
                System.exit(0);
            }else if(e.getActionCommand().equals(ACTION_COMMAND_PRINT_EVENT)){
                System.out.println("Ausgabe von Port: " + portField.getText());
            }
        };

        okButton.addActionListener(buttonListener);
        cancelButton.addActionListener(buttonListener);

        southPanel.add(okButton);
        southPanel.add(cancelButton);

        // create & assign Borders
        Border etchedBorder = BorderFactory.createEtchedBorder();
        Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
        Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
        Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        connectionPanel.setBorder(connectionBorder);
        filePanel.setBorder(fileBorder);
        centerPanel.setBorder(centerBorder);

        // combine Panels
        centerPanel.add(connectionPanel);
        centerPanel.add(filePanel);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        this.add(mainPanel);


        MouseListener buttonMouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JButton sourceButton = (JButton) e.getSource();
                sourceButton.setEnabled(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JButton sourceButton = (JButton) e.getSource();
                sourceButton.setEnabled(true);
            }
        };

        cancelButton.addMouseListener(buttonMouseListener);

        JMenuBar frameMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Datei");

        JMenuItem closeMenuItem = new JMenuItem("Schliessen");
        closeMenuItem.setActionCommand(ACTION_COMMAND_CLOSE_EVENT);
        closeMenuItem.addActionListener(buttonListener);

        fileMenu.add(closeMenuItem);
        frameMenuBar.add(fileMenu);

        JMenu windowSetupMenu = new JMenu("Fenster");
        JMenuItem monitorOneItem = new JMenuItem("Monitor 1");
        JMenuItem monitorTwoItem = new JMenuItem("Monitor 2");
        JMenuItem maximizeItem = new JMenuItem("Maximieren");
        JMenuItem packItem = new JMenuItem("Pack");
        windowSetupMenu.add(monitorOneItem);
        windowSetupMenu.add(monitorTwoItem);
        windowSetupMenu.addSeparator();
        windowSetupMenu.add(maximizeItem);
        windowSetupMenu.add(packItem);

        frameMenuBar.add(windowSetupMenu);

        this.setJMenuBar(frameMenuBar);


        // set JFrame behavior
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) throws ParseException {

        GraphicsDevice defaultScreenDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        System.out.println("Screen Dimensions: "
                + defaultScreenDevice.getDefaultConfiguration().getBounds().getWidth() + " x "
                + defaultScreenDevice.getDefaultConfiguration().getBounds().getHeight());

        new Logon();

        GraphicsEnvironment virtualGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        GraphicsDevice[] screens = virtualGraphicsEnvironment.getScreenDevices();

        for(GraphicsDevice screen : screens){
            System.out.println(screen);
            System.out.println(screen.getDefaultConfiguration());
            System.out.println(screen.getDisplayMode());
            System.out.println(screen.getDefaultConfiguration().getBounds());
            System.out.println(screen.getDefaultConfiguration().getBounds().getWidth()
                    + " x " + screen.getDefaultConfiguration().getBounds().getHeight());
            System.out.println(screen.getDefaultConfiguration().getBounds().getX()
                    + " / " + screen.getDefaultConfiguration().getBounds().getY());
        }
    }

}
