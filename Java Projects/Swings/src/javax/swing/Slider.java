package javax.swing;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import Architect.randcolor;

public class Slider extends JFrame{
	JSlider slider;
	JLabel label;
	public Slider(){
		setLayout(new FlowLayout());
		slider =new JSlider(JSlider.VERTICAL,0,20,0);
		slider.setMajorTickSpacing(5);
		slider.setPaintTicks(true);
		add(slider);
		
		label =new JLabel("Current value is : 0");
		add(label);
		
		Event e=new Event();
		slider.addChangeListener(e);
		
		
	}
	public class Event implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			int value=slider.getValue();
			
			label.setText("Current Value : "+value);
		}
		
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Slider ob=new Slider();
				ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ob.setSize(500,300);
				ob.setVisible(true);
				ob.setTitle("Slider Example");

	}

}
