import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Keyboardcontrol extends Applet implements KeyListener{

	/**
	 * @param args
	 */
	String msg="";
	int x=10,y=20;
	public void init(){
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		showStatus("Key Down");
		int key=arg0.getKeyCode();
		switch(key){
		case KeyEvent.VK_F1:
			msg+="<F1>";
			break;
		case KeyEvent.VK_F2:
			msg+="<F2>";
			break;
		case KeyEvent.VK_F3:
			msg+="<F3>";
			break;
		case KeyEvent.VK_PAGE_DOWN:
			msg+="<pgdn>";
			break;
		case KeyEvent.VK_PAGE_UP:
			msg+="<pgup>";
			break;
		case KeyEvent.VK_LEFT:
			msg+="<LEFT ARROW>";
			break;
		case KeyEvent.VK_RIGHT:
			msg+="<RIGHT ARROW>";
			break;		
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg1) {
		// TODO Auto-generated method stub
		showStatus("Key Up");
		
	}

	@Override
	public void keyTyped(KeyEvent arg2) {
		// TODO Auto-generated method stub
		msg+=arg2.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg, x, y);
	}

}
