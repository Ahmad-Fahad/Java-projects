package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Created by Sign in on 16-05-2017.
 */
public class Clock extends JFrame {

    private  static final long serialVersionUID = 1L;

    JTextField timeF;
    JPanel panel;

    public Clock() {
        //   super("Java clock by Sheikh Muhammad Fahad");
        setSize(260,150);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);

        // initialize the panel

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // initialize the text field
        timeF = new JTextField(10);
        timeF.setEditable(false);
        timeF.setFont(new Font("DS-Digital",Font.PLAIN,48));

        panel.add(timeF);
        panel.setBackground(Color.DARK_GRAY);
        panel.setForeground(Color.DARK_GRAY);
        add(panel);

        Timer t = new Timer(1000,new Listener());
        t.start();

    }



    class Listener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Calendar rightNow = Calendar.getInstance();

            int hour = rightNow.get(Calendar.HOUR_OF_DAY);

            int min  = rightNow.get(Calendar.MINUTE);

            int sec  = rightNow.get(Calendar.SECOND);

            timeF.setText(hour+" : "+min+" : "+sec);
        }
    }
}
