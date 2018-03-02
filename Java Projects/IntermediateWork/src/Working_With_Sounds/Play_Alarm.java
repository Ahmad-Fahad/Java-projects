package Working_With_Sounds;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
 
import javax.swing.JButton;
import javax.swing.JFrame;

import WorkingKeys.KeyHande;

public class Play_Alarm extends JFrame{
	private JButton b,b1;
	public Play_Alarm(){
		setLayout(new FlowLayout());
		b=new JButton(" Start ");
		add(b);
		b1=new JButton(" stop ");
		add(b1);
		action e=new action();
		b.addActionListener(e);
		b1.addActionListener(e);
	}
	
	public class action implements ActionListener{
		private AudioClip click;
		@Override
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			if(a.getSource()==b){
				URL urlClick=Play_Alarm.class.getResource("bs.wav");
				click=Applet.newAudioClip(urlClick);
				click.loop();
			}else if(a.getSource()==b1){
				click.stop();
			}
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Play_Alarm control=new Play_Alarm();
		control.setDefaultCloseOperation(EXIT_ON_CLOSE);
		control.setVisible(true);
		control.setSize(1400,750);
		control.setTitle(" Alarm Rings ");


	}

}
