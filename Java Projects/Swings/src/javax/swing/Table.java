package javax.swing;
import javax.swing.*;
import java.awt.*;
public class Table extends JFrame{
	JTable table;
	public Table(){
	String[] coloumnname={"Name","Color","Gender"};
	Object[][] data={{"Feona","black","Female"},
			{"Niaj","black","male"},
			{"Mumun","brown","female"}};
	table=new JTable(data,coloumnname);
	table.setPreferredScrollableViewportSize(new Dimension(500,50));
	table.setFillsViewportHeight(true);
	JScrollPane scrollpane=new JScrollPane(table);
	add(scrollpane);
	
	}
			

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table ob=new Table();
		ob.setSize(400,200);
		ob.setTitle("My Table");
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}
