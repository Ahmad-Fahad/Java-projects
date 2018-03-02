package Architect;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Architect.HelpWindow;

public class MainWindiw extends JFrame{
	JMenu menu;
	JMenuBar menubar;
	JMenuItem item;
	public MainWindiw(){
		setLayout(new FlowLayout());
		
		menubar=new JMenuBar();
		add(menubar);
		
		menu=new JMenu("Menu");
		menubar.add(menu);
		
		item=new JMenuItem("HelpWindow");
		menu.add(item);
		
		setJMenuBar(menubar);
		
		Event e=new Event();
		item.addActionListener(e);
	}
		public class Event implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				HelpWindow ob=new HelpWindow(MainWindiw.this);
				ob.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				ob.setSize(500,600);
				ob.setLocation(300,300);
				ob.setTitle("Help Window");
				ob.setVisible(true);
			}
			
		}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindiw gui=new MainWindiw();
		gui.setSize(700,600);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Main Wuindow");
	

	}

}
