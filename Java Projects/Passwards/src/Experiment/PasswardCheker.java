package Experiment;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.JobName;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PasswardCheker extends JFrame{
	public JPanel p,p1;
	public JLabel l,l1,l2;
	JPasswordField pf,pf1;
    static String s;
    JPanel pp=new JPanel();
	/**
	 * @param args
	 */
	 
	public void action(){
		setLayout(new FlowLayout());
		  p=new JPanel();
		  l=new JLabel("Enter Passward :");
		 p.add(l);
		 pf=new JPasswordField(8);
		 pf.setEchoChar('?');
		p. add(pf);
		 l1=new JLabel("");
		
		JButton bb=new JButton(" OK ");
		p.add(bb);
		add(l1);
		p1=new JPanel();
		JLabel lr=new JLabel("ReEter passward : ");
		p1.add(lr);
		
		  pf1=new JPasswordField(8);
		p1.add(pf1);
		
		JButton b=new JButton(" ok ");
		p1.add(b);
		
		l1=new JLabel("");
		p1.add(l1);
		pp.add(p1);
		add(pp);
		Evet e=new Evet();
		b.addActionListener(e);
		
		
		pp.add(p);
		Ev v=new Ev();
		bb.addActionListener(v);
	}
	public class Ev implements  ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			  s=pf.getText();
			l1.setText(s);
			try {
				PrintWriter oo=new PrintWriter(new FileWriter("result.txt"));
 					oo.print(s);
 					oo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	 
	public class Evet implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String l="";
			String k="";
			try {
				BufferedReader ii=new BufferedReader(new FileReader("result.txt"));
				while((l=ii.readLine())!=null){
					System.out.println(l);
				}
				k=pf1.getText();
				if(l.equals(k)){
					l1.setText("Correct ");
					
				}else{
					l1.setText("Wrong");
				}
			
			
			} catch (FileNotFoundException e) {
				
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	
		
		PasswardCheker key=new PasswardCheker();
		key.action();
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);;
		key.setSize(1500,709);
		
	}

}
