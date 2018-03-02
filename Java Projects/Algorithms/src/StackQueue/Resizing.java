package StackQueue;

import java.util.Scanner;

public class Resizing {
	public static String[] s;
	public static int n=10;
	
	public   void strarr(int n){
		s=new String[n];
		
	}
	
	public void push(String p){
		if(n==s.length){
			resize(s.length*2);
			s[n++]=p;
		}else{
		s[n++]=p;
		}
	}
	public String pop(){
	 
		if(n==-1){
			System.out.println("underflow");
			return null;
		}else
		return s[--n];
		
	}
	public void resize(int c){
		String[] copy=new String[c];
		for(int i=0;i<n;i++){
			copy[i]=s[i];
			s=copy;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks k=new  Stacks();
		String p="";
		Scanner ii=new Scanner(System.in);
		int n=ii.nextInt();
		 
		for(int i=0;i<100;i++){
			p=ii.nextLine();
			if(p.equals("-")){
				System.out.println(k.pop());
			}else{
				k.push(p);
			}
		}
		

	}
}
