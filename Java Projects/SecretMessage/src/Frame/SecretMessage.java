package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecretMessage extends JFrame{
    private JButton b1,b2,b3,b4;
    private JLabel l1,l2;
    private JTextArea a1,a2;


    public void go(){
        setLayout(new FlowLayout());
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        JPanel p0=new JPanel();


        p5.setLayout(new BoxLayout(p5,BoxLayout.Y_AXIS));
        l1=new JLabel("Message : ");
        p1.add(l1);
        a1=new JTextArea(10,30);
        a1.setFont(new Font("ALGERIAN",Font.BOLD,17));

        p2.add(a1);
        b1=new JButton(" Encrypt ");
        p3.add(b1);
        b2=new JButton(" Decrypt ");
        p3.add(b2);
        b3=new JButton(" Clear ");
        p3.add(b3);
        b4=new JButton(" Save ");
        p3.add(b4);
        l1=new JLabel(" The Message is : ");
        p4.add(l1);
        a2=new JTextArea(10,30);
        a2.setFont(new Font("ALGERIAN",Font.BOLD,17));
        p0.add(a2);

        buttonclicked a=new buttonclicked();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        b4.addActionListener(a);




        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);
        p5.add(p0);
        add(p5);



    }
     private class buttonclicked implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent e) {
             if(e.getSource()==b1){

             }else if(e.getSource()==b2){

             }else if(e.getSource()==b3){
                 a1.setText("");
                 a2.setText("");

             }else if(e.getSource()==b4){

             }

         }
     }




    public static void main(String[] args) {
        SecretMessage key =new SecretMessage();
        key.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        key.setVisible(true);
        key.setSize(800,500);
        key.setTitle("Secret Message");
        key.go();
    }
}
