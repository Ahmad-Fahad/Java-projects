import java.awt.*;

import javax.swing.*;
public class rand extends JPanel{
	public  void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
		Image image=new ImageIcon("catzilla.jpg").getImage();
		g.drawImage(image, 3, 4, this);
	}
}
