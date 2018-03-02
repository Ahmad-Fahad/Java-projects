import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mousecontrol extends Applet implements MouseMotionListener, MouseListener{
	String msg= "";
	int mouseX=0,mouseY=0;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg1) {
		// TODO Auto-generated method stub
		mouseX=0;
		mouseY=10;
		msg= "Mouse Clicked";
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg2) {
		// TODO Auto-generated method stub
		mouseX=0;
		mouseY=10;
		msg= "Mouse Entered";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent arg3) {
		// TODO Auto-generated method stub
		mouseX=0;
		mouseY=10;
		msg= "Mouse Exited";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent arg4) {
		// TODO Auto-generated method stub
		mouseX=0;
		mouseY=10;
		msg= "Down";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent arg5) {
		// TODO Auto-generated method stub
		mouseX=arg5.getX();
		mouseY=arg5.getY();
		msg= "Up";
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent arg6) {
		// TODO Auto-generated method stub
		mouseX=arg6.getX();
		mouseY=arg6.getY();
		msg= "*";
		showStatus("Dragging mouse at"+arg6.getX()+","+arg6.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg7) {
		// TODO Auto-generated method stub
		showStatus("Moving mouse at"+arg7.getX()+","+arg7.getY());
	}
	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}

}
