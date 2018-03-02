package URI;

import java.util.Scanner;

public class Main_1049 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3,r="";
		Scanner ii=new Scanner(System.in);
		s1=ii.nextLine();
		s2=ii.nextLine();
		s3=ii.nextLine();
		if(s1.equals("vertebrado")){
			if(s2.equals("ave")){
				if(s3.equals("carnivoro")){
					r="aguia";
				}else if(s3.equals("onivoro")){
					r="pomba";
				}
			}else if(s2.equals("mamifero")){
				if(s3.equals("onivoro")){
					r="homem";
				}else if(s3.equals("herbivoro")){
					r="vaca";
				}
				
			}
		}else if(s1.equals("invertebrado")){
			if(s2.equals("inseto")){
				if(s3.equals("hematofago")){
					r="pulga";
				}else if(s3.equals("herbivoro")){
					r="lagarta";
				}
			}else if(s2.equals("anelideo")){
				if(s3.equals("hematofago")){
					r="sanguessuga";
				}else if(s3.equals("onivoro")){
					r="minhoca";
				}
				
			}
			
		}
		System.out.println(r);
		
	}

}
