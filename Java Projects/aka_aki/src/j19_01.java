import java.awt.*;
import java.applet.*;

import javax.swing.ImageIcon;
public class j19_01 extends Applet{
	int X1[]={50,80,80,50,20,20};
	int Y1[]={50,70,100,120,100,70};
	int n=6;
	public void paint(Graphics d)
	{
		/*d.drawString("Line between the points A and b : ", 10, 40);
		d.drawLine(20,17,175,17);
		d.drawString("A(20,50)", 20,30);
		d.drawString("B(175,50)",175, 10);
		d.drawString("Line between C and D : ",10,90);
		d.drawLine(20,110,175,110);
		d.drawString("C(20,110)",20,105);
		d.drawString("D(175,150)",180,105);
		d.drawLine(50,17,50,110);
		d.drawRoundRect(130,150,230,250,12,200);*/
		d.setColor(Color.red);
		d.fillRoundRect(280,270,300,350,102,200);
		d.setColor(Color.blue);
		//d.fillPolygon(X1,Y1,n);
		d.drawOval(330,90,200,160);
		d.setColor(Color.green);
		d.fillOval(380,120,100,100);
		d.fillArc(380,240,100,40,180,-180);
		d.setColor(Color.orange);
		d.fillRect(20, 50, 100, 100);
		Image image=new ImageIcon("catzilla.jpg").getImage();
		d.drawImage(image, 3, 4, this);
		
	}
		
}
