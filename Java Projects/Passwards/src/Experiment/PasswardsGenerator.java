package Experiment;

import java.util.Scanner;

public class PasswardsGenerator {
	public void one(){
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
	}
	public void two(){
		for(int i=10;i<100;i++){
			System.out.println(i);
		}
	}
	public void three(){
		
		for(int i=100;i<1000;i++){
			System.out.println(i);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswardsGenerator c=new PasswardsGenerator();
		System.out.println("Enter  number : ");
         Scanner ii=new Scanner(System.in);
         int n=ii.nextInt();
         switch(n){
         case 1: 
               c.one();
               break;
         case 2: 
             c.two();
             break;
         case 3: 
             c.three();
             break;
         
         }
	}

}
