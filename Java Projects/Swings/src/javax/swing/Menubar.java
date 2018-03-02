package javax.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menubar extends JFrame {
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem item;
	public Menubar(){
		
		setLayout(new FlowLayout());
		
		menubar=new JMenuBar();
		setJMenuBar(menubar);
		
		menu=new JMenu("Menu");
		menubar.add(menu);
		
		item=new JMenuItem("Item");
		menu.add(item);
		
		Event e=new Event();
		item.addActionListener(e);
	}
		public class Event implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
			
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menubar b=new Menubar();
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setSize(300,270);
		b.setTitle("Working with  Menu");
		b.setVisible(true);
	}

}
