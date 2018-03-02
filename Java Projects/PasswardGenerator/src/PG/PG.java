package PG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sheikh Muhammad on 13-03-16.
 */
public class PG extends JFrame{
    public JButton b1,b2,b3;
    public JLabel l1,l2,l3,l4,l5;
    public JTextField t1,t2,t3,t4,t5;
    public JTextArea a1;
    public JPanel p1,p2,p3,p4,p5,p6,p7,p0,p8,p9,p10;
    public JComboBox c1=new JComboBox();
    public JComboBox c2=new JComboBox();
    public JComboBox c3=new JComboBox();
    private ImageIcon i=new ImageIcon("w.gif");

    public void go(){
        setLayout(new BorderLayout());

        String[] com1={"Digit","Character","Sign","Digit+Character","Digit+Sign","Digit+Character+Sign"};
        String[] com2={"Name","Birth date","Favourite Number","Dear Ones","Favourite Words"};
        for(int i=0;i<com1.length;i++){
            c1.addItem(com1[i]);
            c1.setMaximumRowCount(6);
            c1.setFont(new Font("Script MT Bold",Font.BOLD,25));


        }
        for(int i=0;i<com2.length;i++){
            c2.addItem(com2[i]);
            c2.setMaximumRowCount(6);
            c2.setFont(new Font("Script MT Bold",Font.BOLD,25));


        }

        p1=new JPanel();
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));

        p2=new JPanel();
        l1=new JLabel("Passward Length : ");
        l1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p2.add(l1);

        t1=new JTextField(4);
        t1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p2.add(t1);


        p3=new JPanel();
        l1=new JLabel("Passward Type : ");
        l1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p3.add(l1);


        p3.add(c1);



        p4=new JPanel();
        l1=new JLabel("Passward From : ");
        l1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p4.add(l1);


        p4.add(c2);


        p5=new JPanel();
        l1=new JLabel("<html>Information according to<br> your passward form</html>");
        l1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p5.add(l1);


        p6=new JPanel();
        t2=new JTextField(10);
        t2.setFont(new Font("Script MT Bold", Font.BOLD, 25));

        p6.add(t2);


        b1=new JButton(" Confirm ");
        b1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p6.add(b1);

        p0=new JPanel();
        p0.setLayout(new BoxLayout(p0,BoxLayout.Y_AXIS));

        p7=new JPanel();
        l1=new JLabel("Your Information :");
        l1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p7.add(l1);

        l2=new JLabel("");
        l2.setFont(new Font("Script MT Bold", Font.BOLD, 40));
        p7.add(l2);


        p8=new JPanel();
        l1=new JLabel("Your Passward : ");
        l1.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p8.add(l1);

        p10=new JPanel();
        a1=new JTextArea(1,12);
        a1.setFont(new Font("Script MT Bold", Font.BOLD, 80));
        a1.setEditable(false);
        p10.add(a1);


        p9=new JPanel();
        b2=new JButton(" New Passward ");
        b2.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p9.add(b2);


        b3=new JButton(" Clear ");
        b3.setFont(new Font("Script MT Bold", Font.BOLD, 25));
        p9.add(b3);


      p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        p1.add(p5);
        p1.add(p6);
        add(p1, BorderLayout.WEST);
       p0.add(p7);
        p0.add(p8);
        p0.add(p10);
       p0.add(p9);
        add(p0,BorderLayout.EAST);
       JPanel p00=new JPanel();

        l4=new JLabel("");
        l4.setText("<html>P<br>A<br>S<br>S<br>W<br>A<br>R<br>D</html>");
        l4.setFont(new Font("Script MT Bold", Font.BOLD, 55));
        l4.setForeground(Color.red);
        p00.add(l4);
        add(p00, BorderLayout.CENTER);
        p00.setBackground(Color.LIGHT_GRAY);

        perform a=new perform();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);


    }
    public class perform implements ActionListener{
        public void  actionPerformed(ActionEvent e){
            if(e.getSource()==b1){

            }else if(e.getSource()==b2){

            }else if(e.getSource()==b3){
                t1.setText("");
                t2.setText("");
                a1.setText("");
            }

        }

    }



    public static void main(String[] args) {
        PG k=new PG();
        k.go();
        k.setVisible(true);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        k.setSize(1000,600);
        k.setTitle("Passward Generator");
    }
}
