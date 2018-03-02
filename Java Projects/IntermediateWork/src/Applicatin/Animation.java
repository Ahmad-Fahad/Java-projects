package Applicatin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation implements KeyListener{
	int x=600;
	int y=600;
	JFrame frame=new JFrame("ANIMATION EXPERIMENT");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Animation obj=new Animation();
	int o=0;
		obj.go( );
	}
		public void go(){
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 MyDrawingMechine  mechine=new MyDrawingMechine ();
			frame.getContentPane().add(mechine);
			frame.setSize(500,500);
			frame.setVisible(true);
			  
			for(int i1=0;i1<500;i1++){
				x=x;
				y=y-1;
				 mechine.repaint();
				try{
					Thread.sleep(10);
					
				}catch(Exception ex){
					
				}
			}
			
		}
		 
		public class MyDrawingMechine extends JPanel {

			/**
			 * @param args
			 */
			public  void paintComponent (Graphics g) {
				// TODO Auto-generated method stub
				g.setColor(Color.black);
				g.fillRect(0,0,this.getWidth(),this.getHeight());
				g.setColor(Color.white);
				//g.fillOval(x, y, 40, 40);
				
				Image aircraft=Toolkit.getDefaultToolkit().getImage("b1.gif");
				g.drawImage(aircraft,x,y,60,80, this);
				

			}


		}
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			int key=arg0.getKeyCode();
			Animation obj=new Animation();
			obj.go();
			
		}
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
