package string;

import java.util.Scanner;

public class Main_1234 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		Scanner ii=new Scanner(System.in);
		s=ii.nextLine();
		char[] cc;
		cc=s.toCharArray();
		//cc=new char[cc.length];
		int n=0;
		if(cc.length>=1 && cc.length<=50){
			char[] ch=new char[cc.length];
			for(int i=0;i<cc.length;i++){
				
				if(cc[i]!=' '){
					n++;
					if(n%2!=0){
						if(cc[i]>='a' && cc[i]<='z'){
							cc[i]=(char) (cc[i]-32);
						}else{
							cc[i]=cc[i];
						}
					}else{
						if(cc[i]>='A' && cc[i]<='Z'){
							cc[i]=(char) (cc[i]+32);
						}else{
							cc[i]=cc[i];
						}
						
					}
				}
				 
		}
			String ss=new String(cc);
			System.out.println(ss);
		
	}
	}

}
