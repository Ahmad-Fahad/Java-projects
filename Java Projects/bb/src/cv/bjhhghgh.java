package cv;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class bjhhghgh extends Applet implements
Runnable,KeyListener
{
	Thread th;
	static	oval ob[] = new oval[30];
	Ball ball;
	Paddle paddle;
	Message mes;
	
	int flag;
    
	boolean runing=true;
	Image image;
	Graphics r;
	int c1,c2,c3,c4;
	int flagg=1;
   
	String ss = "";
	String ss1="";
	String me = "";
	static int score = 0;

	static Font ff;
	TextArea ta;

	public void start()
	{
		th = new Thread(this);
		runing = false;

	}
	public void stop()
	{

		runing = true;
		th = null;
	}
	public void run()
		{

			for(; ;)
			{
				if(ball.over())
				{
					ss = "Game Over!!!!!";
					ss1 = "You have loss the game";
					repaint();
					
					break;

				}
				try
				{	Thread.sleep(20);
					if(runing)break;

					int tempx=Ball.flagx;
					int tempy=Ball.flagy;
					if (tempx==1)
						ball.move();

					else
						ball.move1();
					if(tempy==1)
						ball.move2();
					else
					 	ball.move3();
					if(tempy==1)
						ball.move();
					else
						ball.move3();

					repaint();

				}

				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		}
	public void init()
	{
		
		int xx=70,mm=30;
		for(int i =0 ;i<24;i=i+3)
		{
			ob[i] = new oval(xx,mm);
			ob[i].display=true;
			mm=mm+40;
			ob[i+1] = new oval(xx,mm);
			ob[i+1].display=true;
			mm=mm+40;
			ob[i+2] = new oval(xx,mm);
			ob[i+2].display=true;
			xx=xx+40;
			mm = 30;
		}

		
         
		
				mes =new Message();

		ball = new Ball(90,250);
		paddle = new Paddle(70);

		ff = new Font("arial",Font.BOLD,20);

		this.addKeyListener(this);
		
	}

	public void paint(Graphics g)
	{

		int count=0;
		for(int i=0;i<24;i++)
		{
			if(ob[i].display==false)
				count++;
		}
		if(count==24)
		{
			mes.mess(g);
			System.out.println("Please press enter for next stage.......");
			
			return;
		}
		
		
		g.setColor(Color.BLACK);
		g.fillRect(20,20,410,300);
		g.setColor(Color.red);
		
		g.drawString(ss,100,200);
		g.drawString(ss1,100,230);
		g.setColor(Color.RED);
		for(int j = 0;j<24;j++)
		{
			if(ob[j].display==false)
			{
				continue;
			}
			System.out.print("check   false  :  "+ob[j].display);
 
			if(ob[j].display==true)
			{
				breaking(j) ;

			}
			if(ob[j].display==true)
				ob[j].ppaint(g);
		}

		ball.bpaint(g);
		paddle.paddlepaint(g);

	}


	public void keyTyped(KeyEvent k)
	{
	}
	public void keyReleased(KeyEvent k)
	{

	}

	public void  keyPressed(KeyEvent k)
	{
		int R =k.getKeyCode();
		if(R==k.VK_LEFT)
		{
			if(Paddle.yy > 25)
				Paddle.yy=Paddle.yy-10;
			
			repaint();

		}
		if(R==k.VK_RIGHT)
		{
			if(Paddle.yy < 365 )
			{
				Paddle.yy=Paddle.yy+10;
			}
			
			repaint();

		}
       if(R==k.VK_ENTER)
      
         {  th.start();
        
         }
        
	}
	
		public void update(Graphics g) //to remove flickering
	{
		if (image==null)
		{
			image=createImage(this.getSize().width,this.getSize().height);
			r=image.getGraphics();
		}
		r.setColor(getBackground());
		r.fillRect(0,0,this.getSize().width,this.getSize().height);
		r.setColor(getForeground());
		paint(r);
		g.drawImage(image,0,0,this);

	}


	public boolean breaking(int i)
	{
			if(check(i))
				return true;
			else
				return false;


	}
	public boolean check(int i)
	{
		int am,ami;
		am = Math.abs(ball.x1-ob[i].x);
		ami = Math.abs(ball.y1-ob[i].y);
		if(am<20 && ami<20 )
		{
			ob[i].display=false;
			score=score+10;
			Ball.flagy=1;
			return true;

		}
		else
		{

			return false;

		}

	}


} 




class oval
{
	int i;
	int x,y;
	Graphics g;
	int ballCheck=0;
	boolean display;
	oval(int m ,int n)
	{

		x = m;
		y =n;
	}
	public void ppaint(Graphics g)
	{
		g.fillOval(x,y,25,25);

	}

}

class Ball
{
	static int flag=3;
	static int flagx=1;
	static int flagy=2;
	static int Point = 0;
	static String over="";
	static int life=1;
	int x,y,m;
	int x1,y1;
	Graphics g;
	Ball(int a1,int a2)
	{
		x1 = a1;
		y1 = a2;
	}
	public void bpaint(Graphics g)
	{
		//g.drawString("  y : "+y1,455,250);
		if(20>=x1||x1>=410||y1<=20||y1>=260)   //checking boundaries
		{

			getflag();
		}
		g.setColor(Color.white);
		g.fillOval(x1,y1,15,15);

	}
	public boolean over()
	{
		//System.out.println(""+y1);
		if(y1>290)
			return true;
		else
			return false;
	}
	public void move()
	{
		x1++;

	}
	public void move1()
	{
		x1--;

	}
	public void move2()
	{
		y1=y1+2;
	}
	public void move3()
	{
		y1=y1-2;
	}

	public void move4()
	{
		x1++;
		y1--;
	}

	public void getflag()
	{


		if(x1<=20)  // check boundaries and ball motion
		{
			x1=20;
			flagx=1;
		}
		if(x1>=410)
		{
			x1=410;
			flagx=2;
		}
		if(y1<=20)
		{
			y1=20;
			Point = Point +10;
			flagy=1;
		}
		if(y1>=260)
		{
			if(Paddle.yy>=x1||x1<=(Paddle.yy+50))
			{
				System.out.print("/n /n true Bar.yy :"+Paddle.yy+"Y1:"+y1);
 
				System.out.print(" /n/n/n/ncheck ok");
				y1=260;
				flagy=2;
			}
			else
			{
				System.out.print("/n /n falseBar.yy :"+Paddle.yy+"Y1:"+y1);
 
				if(Paddle.yy>260 && Paddle.yy<200)
				{
					flag=2;
					System.out.print("/n game over");
				}
				else
				{
					if(Paddle.yy>290)
					{
					}
					else
					{
						life=0;
						System.out.print(Paddle.yy);

						over="LOSS GAME";
					}
				}

			} 
		}


	}

}



class Paddle
{
	int ss;
	static int yy=0;
	int q;
	static int pp;
	Paddle(int a)
	{
		yy=a+yy;
	}
	public void paddlepaint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(yy,270,60,10);

	}
}


class Message
{   Thread th;
	public void mess(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0,0,400,300);
		g.setColor(Color.red);
		g.setFont(bjhhghgh.ff);
		g.drawString("YOU HAVE WON !!!!!!!",160,180);
		g.drawString("Your Score is:"+bjhhghgh.score,160,200);
		th.start();

	}
}
