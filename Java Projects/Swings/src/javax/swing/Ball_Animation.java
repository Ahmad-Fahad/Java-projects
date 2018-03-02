package javax.swing;
import javax.swing.*;
import java.awt.*;

public class Ball_Animation {
	int x=70;
	int y=50;
	JFrame frame=new JFrame("ANIMATION EXPERIMENT");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball_Animation obj=new Ball_Animation();
		obj.go();
	}
		public void go(){
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 MyDrawingMechine  mechine=new MyDrawingMechine ();
			frame.getContentPane().add(mechine);
			frame.setSize(500,500);
			frame.setVisible(true);
			for(int i=0;i<500;i++){
				x=x+1;
				y=y+1;
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
				g.fillOval(x, y, 40, 40);

			}


		}
}
