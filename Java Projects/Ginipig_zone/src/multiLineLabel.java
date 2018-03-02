
import javax.swing.*;

import java.awt.*;

public class multiLineLabel extends JFrame{
	
	private void addLegend(){
			JPanel comparisonPanel=getComparisonPanel();
			JLabel legend=new JLabel("aaaa\naasasa\n");
			comparisonPanel.add(legend);
	}
	private JPanel getComparisonPanel() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiLineLabel ob=new multiLineLabel();
		//ob.go();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ob.setSize(1000,1000);
	     ob.setTitle("...DHUMKETU EXPRESS...");
	     ob.setVisible(true);

	}

}
