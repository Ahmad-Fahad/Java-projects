package Architect;


import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class set_Bounds extends JFrame {

    // JPanel
    JPanel pnlButton = new JPanel();
    // Buttons
    JButton btnAddFlight = new JButton("Add Flight");

    public set_Bounds() {
        // FlightInfo setbounds
    	//this.setLayout(null);
    	//JFrame frame=new JFrame();
    	//Container contantpane=frame.getContentPane();
      btnAddFlight.setBounds(0, 500, 100, 100);
      //contantpane.add(btnAddFlight);
      btnAddFlight.setBackground(Color.BLUE);
        // JPanel bounds
       pnlButton.setBounds(800, 800, 200, 100);
        //pnlButton.setLayout(null);

        // Adding to JFrame
        pnlButton.add(btnAddFlight);
   
        add(pnlButton);
 
        // JFrame properties
        setSize(800, 600);
        setBackground(Color.BLACK);
        setTitle("Air Traffic Control");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new set_Bounds();
    }
}

