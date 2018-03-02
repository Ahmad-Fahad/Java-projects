package Architect;
  import javax.swing.*;

  import java.awt.*;
import java.awt.event.*;
public class randcolor extends JFrame{
	JPanel panel;
	public randcolor(){
		panel=new JPanel();
		panel.setBackground(randomColor());
		add(panel);
		
		Event e=new Event();
		panel.addMouseListener(e);
	}
	private Color randomColor() {
		// TODO Auto-generated method stub
		int r=(int)(Math.random()*225);
		int g=(int)(Math.random()*225);
		int b=(int)(Math.random()*225);
		return (new Color(r,g,b));
	}
	public class Event implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			panel.setBackground(randomColor());
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randcolor ob=new randcolor();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(300,300);
		ob.setVisible(true);
		ob.setTitle("Random color exeample");

	}

}
