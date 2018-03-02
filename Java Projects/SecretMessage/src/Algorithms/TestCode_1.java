package Algorithms;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TestCode_1 extends JFrame {
    private JButton b1,b2,b3,b4;
    private JLabel l1,l2;
    public JTextArea a1,a2;
    CryptoCode key =new CryptoCode();


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
        l1.setFont(new Font("ALGERIAN",Font.BOLD,17));
        l1.setForeground(Color.BLUE);
        p1.add(l1);
        a1=new JTextArea(10,50);
        a1.setFont(new Font("ALGERIAN",Font.BOLD,17));
        a1.setBackground(Color.LIGHT_GRAY);
        p2.add(new JScrollPane(a1));

        b1=new JButton(" Encrypt ");
       // b1.setBackground(Color.red);
        p3.add(b1);
        b2=new JButton(" Decrypt ");
      //  b2.setBackground(Color.red);
        p3.add(b2);
        b3=new JButton(" Clear ");
       // b3.setBackground(Color.red);
        p3.add(b3);
        b4=new JButton(" Save ");
      //  b4.setBackground(Color.red);
        p3.add(b4);

        l1=new JLabel(" The Message is : ");
        l1.setFont(new Font("ALGERIAN", Font.BOLD, 17));
        l1.setForeground(Color.BLUE);
        p4.add(l1);
        a2=new JTextArea(10,50);
        a2.setEditable(false);
        a2.setFont(new Font("ALGERIAN",Font.BOLD,17));
        a2.setBackground(Color.LIGHT_GRAY);
        p0.add(new JScrollPane(a2));


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
    private class buttonclicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1){
                String s=a1.getText();
                String s0=key.Enscrypt(s);
                a2.setText(s0);




            }else if(e.getSource()==b2){


                String s=a1.getText();
                String s0=key.Decrypt(s);
                a2.setText(s0);




            }else if(e.getSource()==b3){
                a1.setText("");
                a2.setText("");

            }else if(e.getSource()==b4){

            }

        }
    }




    public static void main(String[] args) {
        TestCode_1 key =new TestCode_1();
        key.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        key.setVisible(true);
        key.setSize(800,500);
        key.setTitle("Secret Message");
        key.go();
    }
}
class CryptoCode {
    public static String s="",s0="";
    public static char[] ch;
    public static char[] cg;
    public static int[] arr;
    public static int n,m,r;
    public static char k;
    public String Enscrypt(String s){
        ch=s.toCharArray();
        arr=new int[ch.length];
        for(int i=0;i <ch.length;i++){

            m=(int)ch[i];
            n=m+3;
            r=n%122;
            arr[i]=r;

        }
        cg=new char[ch.length];
        for(int i=0;i<ch.length;i++) {

            cg[i] = (char) arr[i];

        }
        s0=new String(cg);


     return s0;








    }
    public String Decrypt(String s){


        ch=s.toCharArray();
        arr=new int[ch.length];
        for(int i=0;i <ch.length;i++){

            m=(int)ch[i];
            n=m-3;
            r=n%122;
            arr[i]=r;

        }
        cg=new char[ch.length];
        for(int i=0;i<ch.length;i++) {

            cg[i] = (char) arr[i];

        }
        s0=new String(cg);


        return  s0;

    }


}
