package WorkShop;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class ImageGallery extends JFrame{
	
	public static int x=1,y=0;
	JPanel pn1=new JPanel();
	JPanel pn2=new JPanel();
	JPanel pn3=new JPanel();
	JPanel pn4=new JPanel();
	
	public JButton next,previous,mid;
	public JLabel photo,message1,message2;
	public ImageIcon i1=new ImageIcon("k0.jpg");
	public ImageIcon i2=new ImageIcon("k1.jpg");
	public ImageIcon i3=new ImageIcon("k2.jpg");
	public ImageIcon i4=new ImageIcon("k3.jpg");
	public ImageIcon i5=new ImageIcon("k4.jpg");
	public ImageIcon i6=new ImageIcon("k5.jpg");
	public ImageIcon i7=new ImageIcon("k6.jpg");
	public ImageIcon i8=new ImageIcon("k7.jpg");
	public ImageIcon i9=new ImageIcon("k8.jpg");
	public ImageIcon i10=new ImageIcon("k9.jpg");
	public ImageIcon i11=new ImageIcon("k10.jpg");
	public ImageIcon i12=new ImageIcon("k11.jpg");
	public ImageIcon i13=new ImageIcon("k12.jpg");
	public ImageIcon i14=new ImageIcon("k13.jpg");
	public ImageIcon i15=new ImageIcon("k14.jpg");
	public ImageIcon i16=new ImageIcon("k15.jpg");
	public ImageIcon i17=new ImageIcon("k16.jpg");
	public ImageIcon i18=new ImageIcon("k17.jpg");
	public ImageIcon i19=new ImageIcon("k18.jpg");
	public ImageIcon i20=new ImageIcon("k19.jpg");
	public ImageIcon i21=new ImageIcon("k20.jpg");
	public ImageIcon i22=new ImageIcon("left.png");
	public ImageIcon i23=new ImageIcon("right.png");
	
	public ImageGallery(String s){
		super(s);
		
		setLayout(new BorderLayout());
		
		 photo=new JLabel(i1);
		 
			pn1.add(photo);
		
		message1=new JLabel("<html>Think<br>about<br>the<br>Creation<br>of<br>Allah</html>");
		message1.setFont(new Font("ALGERIAN",Font.ITALIC,25));
		message1.setForeground(Color.BLACK);
		pn2.add(message1);
		
		message2=new JLabel("<html>How<br>beautiful<br>his<br>Creation<br>is !</html>");
		message2.setFont(new Font("ALGERIAN",Font.ITALIC,25));
		message2.setForeground(Color.BLACK);
		pn3.add(message2);
		
		JToolBar toolbar=new JToolBar();
		
		previous=new JButton("  <<  ");
		
		toolbar.add(previous);
		toolbar.addSeparator();
		
		mid=new JButton("  | |  ");
		toolbar.add(mid);
		
		toolbar.addSeparator();
		
		next=new JButton("  >>  ");
		toolbar.add(next);
		
		pn4.add(toolbar);
		
		pn2.setBackground(Color.LIGHT_GRAY);
		pn3.setBackground(Color.LIGHT_GRAY);
		pn4.setBackground(Color.GRAY);
		pn1.setBackground(Color.LIGHT_GRAY);
		
		add(pn1,BorderLayout.CENTER);
		add(pn2,BorderLayout.WEST);
		add(pn3,BorderLayout.EAST);
		add(pn4,BorderLayout.SOUTH);
		
		effect1 a=new effect1();
		next.addActionListener(a);
		
		effect2 b=new effect2();
		previous.addActionListener(b);
		
		
	}
	
	public class effect1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			x=x+1;
			if(x<=20){
				switch(x){
				case 1:photo.setIcon(i1);
				message1.setText("<html>Every<br>thing<br>we<br>see<br>or<br>not<br>see<br>is<br>creation<br>of<br>ALLAH<br>accept<br>ALLAH</html>");
				message2.setText("<html>ALLAH<br>Can<br>do<br>everything<br>without<br>the<br>help<br>of<br>his<br>Creations</html>");
				break;
				
				case 2:photo.setIcon(i2);
				message1.setText("<html>ALLAH<br>is<br>kind<br>mercyful<br>to<br>his<br>creation</html>");
				message2.setText("<html>ALLAH<br>loves<br>human<br>more<br>than<br>70 times<br>than<br>a<br>mother<br>loves<br>her<br>Child</html>");
				break;
				
				case 3:photo.setIcon(i3);
				message1.setText("<html>ALLAH<br>gives<br>a great<br>deal of<br>Neamots<br>to us</html>");
				message2.setText("<html>which<br>is<br>not<br>meassureable</html>");
				break;
				
				case 4:photo.setIcon(i4);
				message1.setText("<html>Our<br>Healthy<br>life<br>foods<br>water<br>parents<br>children<br>Natural<br>buties<br>Everything<br>He gives<br>only<br>for<br>his<br>kindneess<br></html>");
				message2.setText("<html>We<br>should<br>think<br>about<br>these<br>Neamots<br>and<br>be<br>Grateful<br>to him</html>");
				break;
				
				case 5:photo.setIcon(i5);
				message1.setText("<html>We<br>Should<br>love<br>Him<br>and His<br>Rasul<br>Sallallahu<br>Alaihi <br>oa Sallam<br>more<br>than<br>everything</html>");
				message2.setText("<html>This<br>love<br>will be<br>expressed<br>when<br>we <br>expend<br>our lives<br>wealth<br>and<br>time<br>in the<br>path of<br>ALLAH</html>");
				break;
				
				case 6:photo.setIcon(i6);
				message1.setText("<html>ALLAH<br>is<br>Almighty</html>");
				message2.setText("<html>ALLAH<br>needs<br>no help<br>of<br>others</html>");
				break;
				
				
				
                case 7:photo.setIcon(i7);
   				message1.setText("<html>Fire<br>can not<br>burn<br>and<br>water<br>can not<br>sink<br>without<br>the<br>order of<br>ALLAH</html>");
				message2.setText("<html>land<br>has no<br>power<br>to give<br>crops<br>and<br>the plant<br>has <br>no power<br>to give<br>fruits</html>");
				break;
				
				case 8:photo.setIcon(i8);
				message1.setText("<html>Tree<br>has<br>no<br> power<br>to<br>give<br>fruits</html>");
				message2.setText("<html>And<br>foods<br><br>have<br>no<br>power</html>");
				break;
				
				case 9:photo.setIcon(i9);
				message1.setText("<html>sky<br>has no <br>power<br>to give<br>rain</html>");
				message2.setText("<html>sun<br>has<br>no<br>power<br>to<br>shine</html>");
				break;
				
				case 10:photo.setIcon(i10);
				message1.setText("<html>Allah<br>knows<br>every<br>thing</html>");
				message2.setText("<html>every<br>thing<br>is<br>obeying<br>his<br>orders</html>");
				break;
				
				case 11:photo.setIcon(i11);
				message1.setText("<html>Allah<br>has<br>created<br>Zannat<br>billion<br>trillion<br>more<br>beautiful<br>than<br>earth</html>");
				message2.setText("<html>there<br>man<br>will<br>have<br>no<br>worries</html>");
				break;
				
				case 12:photo.setIcon(i12);
				message1.setText("<html>in<br>Zannat<br>man<br>will<br>eat<br>what<br>he<br>will<br>want<br>to<br>eat</html>");
				message2.setText("<html>he<br>can<br>do<br>everything<br>what<br>he<br>will<br>want to<br>do</html>");
				break;
				
				case 13:photo.setIcon(i13);
				message1.setText("<html>every<br>where<br>he<br>will<br>found<br>peace<br>and<br>peace</html>");
				message2.setText("<html>two<br>fears<br>will not<br>be<br>togethr</html>");
				break;
				
				case 14:photo.setIcon(i14);
				message1.setText("<html>in<br>earth<br>who<br>will be<br>afraid of<br>Allah<br>he will<br>have<br>no fear<br>after<br>death</html>");
				message2.setText("<html>true<br>belief<br>iman<br>lies in<br>between<br>of fear<br>and<br>expectation<br>of<br>Allah</html>");
				break;
				
				case 15:photo.setIcon(i15);
				message1.setText("<html>if one<br>increases<br>and<br>oter<br>decreases<br>then<br>one<br>may fall<br>in<br>loss<br>about<br>his<br>din</html>");
				message2.setText("<html>we<br>should<br>never<br>indifferent<br>to our<br>iman</html>");
				break;
				
				case 16:photo.setIcon(i16);
				message1.setText("<html>if<br>one<br>calls<br>Allah<br>one time<br>Allah<br>responses<br>70 times<br>of his<br>response</html>");
				message2.setText("<html>Allah<br>becomes<br>very<br>glad<br>when<br>a man<br>come<br>back<br>from<br>his<br>bad<br>deeds<br>to<br>Allah</html>");
				break;
				
				case 17:photo.setIcon(i17);
				
				message1.setText("<html>if<br>a man<br>calls<br>his<br>lover<br>smore<br>times<br>he will<br>disturbs<br>too</html>");
				message2.setText("<html>But<br>the<br>more<br>you call<br>Allah<br>the <br>more<br>he will<br>love<br>you<br>and<br>never<br>disturbs</html>");
				break;
				
				case 18:photo.setIcon(i18);
				message1.setText("<html>if you<br>want<br>something<br>to others<br>again<br>and again<br>he will<br>be<br>annoyed</html>");
				message2.setText("<html>but<br>the<br>more<br>you<br>want to<br>Allah<br>the more<br>He will<br>love<br>you<br>and<br>never<br>be<br>annoyed</html>");
				break;
				
				case 19:photo.setIcon(i19);
				message1.setText("<html>the<br>time<br>of our<br>life<br>in earth<br>is very<br>little<br>but<br>very<br>important</html>");
				message2.setText("<html>for<br>some<br>moments<br>in earth<br>will be<br>results<br>for a <br>longtime<br>sorrow<br>or<br>universal<br>happiness<br>in<br>after<br>death</html>");
				break;
				
				case 20:photo.setIcon(i20);
				message1.setText("<html>time<br>is<br>being<br>finished</html>");
				message2.setText("<html>we<br>should<br>proper<br>use of<br>it</html>");
				break;
				
				case 21:photo.setIcon(i21);
				message1.setText("<html>true<br>peace<br>and<br>success<br>in earth<br>and<br>after<br>death<br>lies in<br>islam</html>");
				message2.setText("<html>so<br>come<br>back<br>to<br>islam</html>");
				break;
				
		}
			}else{
				x=0;
			}
		
		}
	}
	
	public class effect2  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			x=x-1;
			if(x<=20){
				switch(x){
				case 1:photo.setIcon(i1);
				message1.setText("<html>Every<br>thing<br>we<br>see<br>or<br>not<br>see<br>is<br>creation<br>of<br>ALLAH<br>accept<br>ALLAH</html>");
				message2.setText("<html>ALLAH<br>Can<br>do<br>everything<br>without<br>the<br>help<br>of<br>his<br>Creations</html>");
				break;
				
				case 2:photo.setIcon(i2);
				message1.setText("<html>ALLAH<br>is<br>kind<br>mercyful<br>to<br>his<br>creation</html>");
				message2.setText("<html>ALLAH<br>loves<br>human<br>more<br>than<br>70 times<br>than<br>a<br>mother<br>loves<br>her<br>Child</html>");
				break;
				
				case 3:photo.setIcon(i3);
				message1.setText("<html>ALLAH<br>gives<br>a great<br>deal of<br>Neamots<br>to us</html>");
				message2.setText("<html>which<br>is<br>not<br>meassureable</html>");
				break;
				
				case 4:photo.setIcon(i4);
				message1.setText("<html>Our<br>Healthy<br>life<br>foods<br>water<br>parents<br>children<br>Natural<br>buties<br>Everything<br>He gives<br>only<br>for<br>his<br>kindneess<br></html>");
				message2.setText("<html>We<br>should<br>think<br>about<br>these<br>Neamots<br>and<br>be<br>Grateful<br>to him</html>");
				break;
				
				case 5:photo.setIcon(i5);
				message1.setText("<html>We<br>Should<br>love<br>Him<br>and His<br>Rasul<br>Sallallahu<br>Alaihi <br>oa Sallam<br>more<br>than<br>everything</html>");
				message2.setText("<html>This<br>love<br>will be<br>expressed<br>when<br>we <br>expend<br>our lives<br>wealth<br>and<br>time<br>in the<br>path of<br>ALLAH</html>");
				break;
				
				case 6:photo.setIcon(i6);
				message1.setText("<html>ALLAH<br>is<br>Almighty</html>");
				message2.setText("<html>ALLAH<br>needs<br>no help<br>of<br>others</html>");
				break;
				
				
				
                case 7:photo.setIcon(i7);
   				message1.setText("<html>Fire<br>can not<br>burn<br>and<br>water<br>can not<br>sink<br>without<br>the<br>order of<br>ALLAH</html>");
				message2.setText("<html>land<br>has no<br>power<br>to give<br>crops<br>and<br>the plant<br>has <br>no power<br>to give<br>fruits</html>");
				break;
				
				case 8:photo.setIcon(i8);
				message1.setText("<html>Tree<br>has<br>no<br> power<br>to<br>give<br>fruits</html>");
				message2.setText("<html>And<br>foods<br><br>have<br>no<br>power</html>");
				break;
				
				case 9:photo.setIcon(i9);
				message1.setText("<html>sky<br>has no <br>power<br>to give<br>rain</html>");
				message2.setText("<html>sun<br>has<br>no<br>power<br>to<br>shine</html>");
				break;
				
				case 10:photo.setIcon(i10);
				message1.setText("<html>Allah<br>knows<br>every<br>thing</html>");
				message2.setText("<html>every<br>thing<br>is<br>obeying<br>his<br>orders</html>");
				break;
				
				case 11:photo.setIcon(i11);
				message1.setText("<html>Allah<br>has<br>created<br>Zannat<br>billion<br>trillion<br>more<br>beautiful<br>than<br>earth</html>");
				message2.setText("<html>there<br>man<br>will<br>have<br>no<br>worries</html>");
				break;
				
				case 12:photo.setIcon(i12);
				message1.setText("<html>in<br>Zannat<br>man<br>will<br>eat<br>what<br>he<br>will<br>want<br>to<br>eat</html>");
				message2.setText("<html>he<br>can<br>do<br>everything<br>what<br>he<br>will<br>want to<br>do</html>");
				break;
				
				case 13:photo.setIcon(i13);
				message1.setText("<html>every<br>where<br>he<br>will<br>found<br>peace<br>and<br>peace</html>");
				message2.setText("<html>two<br>fears<br>will not<br>be<br>togethr</html>");
				break;
				
				case 14:photo.setIcon(i14);
				message1.setText("<html>in<br>earth<br>who<br>will be<br>afraid of<br>Allah<br>he will<br>have<br>no fear<br>after<br>death</html>");
				message2.setText("<html>true<br>belief<br>iman<br>lies in<br>between<br>of fear<br>and<br>expectation<br>of<br>Allah</html>");
				break;
				
				case 15:photo.setIcon(i15);
				message1.setText("<html>if one<br>increases<br>and<br>oter<br>decreases<br>then<br>one<br>may fall<br>in<br>loss<br>about<br>his<br>din</html>");
				message2.setText("<html>we<br>should<br>never<br>indifferent<br>to our<br>iman</html>");
				break;
				
				case 16:photo.setIcon(i16);
				message1.setText("<html>if<br>one<br>calls<br>Allah<br>one time<br>Allah<br>responses<br>70 times<br>of his<br>response</html>");
				message2.setText("<html>Allah<br>becomes<br>very<br>glad<br>when<br>a man<br>come<br>back<br>from<br>his<br>bad<br>deeds<br>to<br>Allah</html>");
				break;
				
				case 17:photo.setIcon(i17);
				
				message1.setText("<html>if<br>a man<br>calls<br>his<br>lover<br>smore<br>times<br>he will<br>disturbs<br>too</html>");
				message2.setText("<html>But<br>the<br>more<br>you call<br>Allah<br>the <br>more<br>he will<br>love<br>you<br>and<br>never<br>disturbs</html>");
				break;
				
				case 18:photo.setIcon(i18);
				message1.setText("<html>if you<br>want<br>something<br>to others<br>again<br>and again<br>he will<br>be<br>annoyed</html>");
				message2.setText("<html>but<br>the<br>more<br>you<br>want to<br>Allah<br>the more<br>He will<br>love<br>you<br>and<br>never<br>be<br>annoyed</html>");
				break;
				
				case 19:photo.setIcon(i19);
				message1.setText("<html>the<br>time<br>of our<br>life<br>in earth<br>is very<br>little<br>but<br>very<br>important</html>");
				message2.setText("<html>for<br>some<br>moments<br>in earth<br>will be<br>results<br>for a <br>longtime<br>sorrow<br>or<br>universal<br>happiness<br>in<br>after<br>death</html>");
				break;
				
				case 20:photo.setIcon(i20);
				message1.setText("<html>time<br>is<br>being<br>finished</html>");
				message2.setText("<html>we<br>should<br>proper<br>use of<br>it</html>");
				break;
				
				case 21:photo.setIcon(i21);
				message1.setText("<html>true<br>peace<br>and<br>success<br>in earth<br>and<br>after<br>death<br>lies in<br>islam</html>");
				message2.setText("<html>so<br>come<br>back<br>to<br>islam</html>");
				break;
		}
			}else{
				x=0;
			}
		
			
			
		}
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageGallery key=new ImageGallery(" MESSAGE TO HUMAN ");
		
		key.setSize(900,600);
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);
		
		

	}

public class key implements KeyListener{
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
        	
        	
        	}else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
}