package PROJECTS_OK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Effective_Calculator extends JFrame{
	JButton add,subtract,multiply,divide;
	JTextField num1;
	JTextField num2;
	JLabel result,enter1,enter2;
	
	public void Calculator(){
		setLayout(new FlowLayout());
		GridBagConstraints c=new GridBagConstraints();
		enter1=new JLabel("1st : ");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		add(enter1,c);
		
		num1=new JTextField(10);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=3;
		add(num1,c);
		
		enter2=new JLabel("2nd : ");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=1;
		add(enter2,c);
		
		num2=new JTextField(10);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=3;
		add(num2,c);
		

		add=new JButton("+");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=2;
		c.gridwidth=1;
		add(add,c);
		
		subtract=new JButton("-");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=2;
		c.gridwidth=1;
		add(subtract,c);
		
		multiply=new JButton("x");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridy=2;
		c.gridwidth=1;
		add(multiply,c);
		
		divide=new JButton("/");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=3;
		c.gridy=2;
		c.gridwidth=1;
		add(divide,c);
		
		result=new JLabel("");
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=4;
		c.gridwidth=4;
		add(result,c);
		
		Event e=new Event();
		add.addActionListener(e);
		subtract.addActionListener(e);
		multiply.addActionListener(e);
		divide.addActionListener(e);
		
		
		
	}
	public class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double n1,n2;
			try{
				n1=Double.parseDouble(num1.getText());
				
				
			}catch(Exception ex){
				result.setText("ILLEAGAL DATA IN FIRST FIELD  !!!");
				result.setForeground(Color.red);
				return;
			}
			try{
				n2=Double.parseDouble(num2.getText());
				
				
			}catch(Exception ev){
				result.setText("ILLEAGAL DATA IN SECOND FIELD  !!!");
				result.setForeground(Color.red);
				return;
			}
			
			String op=e.getActionCommand();
			
			if(op.equals("+")){
				double sum=n1+n2;
				result.setText(n1+"+"+n2+"="+sum);
				result.setForeground(Color.GREEN);
				
			}
			
			if(op.equals("-")){
				double minus=n1-n2;
				result.setText(n1+"-"+n2+"="+minus);
				result.setForeground(Color.GREEN);
				
			}
			
			if(op.equals("x")){
				double mul=n1*n2;
				result.setText(n1+" x "+n2+"="+mul);
				result.setForeground(Color.GREEN);
				
			}
			if(op.equals("/")){
				double divide=n1/n2;
				
				result.setText(n1+" / "+n2+"="+divide);
				result.setForeground(Color.GREEN);
				
			}
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Effective_Calculator gui=new Effective_Calculator();
		gui.Calculator();
		gui.setSize(250,175);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Efective Calculator");

	}

}
