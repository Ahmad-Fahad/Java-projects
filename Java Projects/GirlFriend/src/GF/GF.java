package GF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sheikh Muhammad on 09-03-16.
 */
public class GF extends JFrame{
    JLabel l2,l1;
    JButton b1,b2;

    private  void go(){
        setLayout(new FlowLayout());
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        l1=new JLabel("<html>Will you <br>be my<br>Girlfriend</html>");
        l1.setFont(new Font("ALGERIAN", Font.BOLD, 80));
        l1.setForeground(Color.BLUE);
        p2.add(l1);

        b1=new JButton(" YES ");
        b1.setBackground(Color.GREEN);
        p3.add(b1);

        b2=new JButton(" NO ");
        b2.setBackground(Color.RED);
        p3.add(b2);

        l2=new JLabel("NO button does not work !!!!");
        p4.add(l2);

        p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        add(p1);

        tip a=new tip();
        b1.addActionListener(a);

    }
    public class tip implements ActionListener{
        public void actionPerformed(ActionEvent e){
            gfReistration k=new gfReistration();
            k.setVisible(true);
            k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            k.setSize(800,500);
            dispose();



        }


    }

    public static void main(String[] args) {

        GF k=new GF();
        k.setSize(800,500);
        k.setVisible(true);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        k.go();

    }
}
