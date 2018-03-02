package WorkingWithImage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class ImageDrawing extends JFrame {
	public  void go(){
		drawimg ob=new drawimg();
		add(ob);
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageDrawing key=new ImageDrawing();
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);;
		key.setSize(1500,750);
		key.go();
		 
		
	}
}
 class drawimg extends JComponent{
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		Image im=Toolkit.getDefaultToolkit().getImage("fan.gif");
		g2.drawImage(im, 100, 100,50,50, this);
	}
	
}