package Experiment;

import java.util.Scanner;

import BuildedIn.ShortPath;

public class PasswardBook extends ShortPath{
	static ShortPath p=new ShortPath();
	static Scanner ii=new Scanner(System.in);
	/**
	 * @param args
	 * @param  
	 */
	/*
	 *create an account (name ,passward )
	 *identify himself()
	 *save this in file(file outputstreamoperation)
	 *next save  other account name and passward in file after modifying
	 *display its name and serial no
	 *if one to show display it in modify version
	 */
	/*
	 * **Activities***
	 * set border layout
	 * input fields in center 
	 * add a scrollbar
	 */
	public void letter(int[] passward){
		p.pn("Enter a mode :\n1 for easy(replaced by only letter)\n2 for medium \n3 for strong \n4 for hard ");
		int mode=ii.nextInt();
		if(mode==1){
		for(int pi=0;pi<4;pi++){
		switch(passward[pi]){
		case 1:
			p.p("a");
			break;
		case 2:
			p.p("b");
			break;
		case 3:
			p.p("c");
			break;
		case 4:
			p.p("d");
			break;
		case 5:
			p.p("e");
			break;
		case 6:
			p.p("f");
			break;
		case 7:
			p.p("g");
			break;
		case 8:
			p.p("h");
			break;
		case 9:
			p.p("i");
			break;
		case 0:
			p.p("j");
			break;
		}
		
	}
		}
	}

		public void word(int[] passward){
			p.pn("Enter a mode :\n1 for easy(notice the first or first two letters of the words)\n2 for medium \n3 for strong \n4 for hard ");
			int mode=ii.nextInt();
			if(mode==1){
		for(int pi=0;pi<4;pi++){
		switch(passward[pi]){
		case 1:
			p.p("oman ");
			break;
		case 2:
			p.p("team ");
			break;
		case 3:
			p.p("thunder ");
			break;
			
		case 4:
			p.p("fort ");
			break;
			
		
		case 5:
			p.p("fight ");
			break;
		case 6:
			p.p("sick ");
			break;
		case 7:
			p.p("sea ");
			break;
		case 8:
			p.p("egg ");
			break;
		case 9:
			p.p("news ");
			break;
		case 0:
			p.p("zoo ");
			break;
		}
		}
		}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PasswardBook b=new PasswardBook();
		
		p.pn("Enter your passward :");
		int n=0,i;
		int[] passward=new int[4];
		
		for(i=0;i<4;i++){
			passward[i]=ii.nextInt();
		}
		p.pn("Enter a Format :\n1 for Letter\n2 for  word ");
		int format=ii.nextInt();
		p.pn("Your passward is : ");
		 switch(format){
		 case 1:
			 b.letter(passward);
			 break;
		 case 2:
			 b.word(passward);
			 break;
		 }
 
					p.pn("");
		p.pn("show real passward :(press 1 )");
		n=ii.nextInt();
		if(n==1){
			for(int l=0;l<4;l++){
				p.p(passward[l]);
			
		}
		}

	}

}
