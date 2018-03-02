package javax.swing;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyDrawPanel extends JPanel{

	//private Color andColor;

	/**
	 * @param args
	 */
	public  void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d=(Graphics2D)g;
		int red=(int)(Math.random()*225);
		int green=(int)(Math.random()*225);
		int blue=(int)(Math.random()*225);
		Color startColor=new Color(red,green,blue);
		 red=(int)(Math.random()*225);
		 green=(int)(Math.random()*225);
		 blue=(int)(Math.random()*225);
		Color andColor=new Color(red,green,blue);
		GradientPaint gradiant=new GradientPaint(70,70,startColor,150,150,andColor);
		g2d.setPaint(gradiant);
		g2d.fillOval(70,70,100,100);

	}

}
