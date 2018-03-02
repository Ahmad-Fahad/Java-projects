import java.awt.*;
import java.applet.*;
public class BarChart extends Applet{
	int n=0;
	String Level[];
	int value[];
	
	public void intit(){
		try{
			n=Integer.parseInt(getParameter("ocloum"));
			Level=new String[n];
			value=new int[n];
			Level[0]=getParameter("Level1");
			Level[1]=getParameter("Level2");
			Level[2]=getParameter("Level3");
			Level[3]=getParameter("Level4");
			Level[4]=getParameter("Level5");
			Level[5]=getParameter("Level6");
			
			value[0]=Integer.parseInt(getParameter("c1"));
			value[1]=Integer.parseInt(getParameter("c2"));
			value[2]=Integer.parseInt(getParameter("c3"));
			value[3]=Integer.parseInt(getParameter("c4"));
			value[4]=Integer.parseInt(getParameter("c5"));
			
		}
		catch(NumberFormatException E){}
	}
	public void paint(Graphics g)
			{
		for(int i=0;i<5;i++){
			if(i%2==0){
				g.setColor(Color.blue);
			}
				else
					g.setColor(Color.red);
				g.drawString(Level[i],20,i*40+20);
				g.fillRect(50,i*40+10,value[i],30);
			}
		}
			
		
	}



