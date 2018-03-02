package EnscriptionTechnology;

import java.util.Scanner;

public class EnscriptString {

	/**
	 * @param args
	 */
	public static void encrypt(String s1){
		 
		
		char[] array=s1.toCharArray();
		for(int i=0;i<array.length;i++){
			array[i]++;
		}
		String encrypted=new String(array);
		System.out.println(encrypted);
	}
	public static void decrypt(String s1){
		 
		char[] array=s1.toCharArray();
		for(int i=0;i<array.length;i++){
			array[i]--;
		}
		String dencrypted=new String(array);
		System.out.println(dencrypted);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnscriptString on=new EnscriptString();
		Scanner in=new Scanner(System.in); 
		System.out.println("Enrer a Message that you want to encrypt and decrrypt : ");
		String s1;
		s1=in.nextLine();
		on.encrypt(s1);
		on.decrypt(s1);
		 System.out.println("......");
		 

	}

}
