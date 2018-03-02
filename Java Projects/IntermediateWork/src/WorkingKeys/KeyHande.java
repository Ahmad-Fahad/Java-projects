package WorkingKeys;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

import javax.swing.JFrame;

public class KeyHande extends JFrame {

	/**
	 * @param args
	 */
	
	public void Action(){
		draw e=new draw();
		this.addKeyListener(e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyHande control=new KeyHande();
		control.setDefaultCloseOperation(EXIT_ON_CLOSE);
		control.setVisible(true);
		control.setSize(1400,750);
		control.setTitle("AirCraft Control");
		control.Action();


	}
public class draw implements KeyListener{
	 

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode()==KeyEvent.VK_L){
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g){
		Graphics2D ga=(Graphics2D)g;
		Image i=Toolkit.getDefaultToolkit().getImage("b1.gif");
		ga.drawImage(i,232,345,80,70,(ImageObserver) this);
	}

}
}