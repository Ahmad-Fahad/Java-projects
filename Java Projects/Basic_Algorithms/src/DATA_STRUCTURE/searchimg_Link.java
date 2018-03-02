package DATA_STRUCTURE;
import java.util.Scanner;
public class searchimg_Link {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			int[] LINK=new int[20];
			int[] LIST=new int[20];
			int START=11,p=START;
			int y=0;
			int x=0;
			Scanner input=new Scanner(System.in);
			LIST[0]=22;LIST[2]=5;LIST[3]=19;LIST[5]=87;LIST[7]=29;LIST[8]=79;LIST[9]=33;LIST[11]=2;LIST[13]=50;LIST[14]=8;LIST[16]=55;LIST[18]=99;
			LINK[0]=3;LINK[2]=13;LINK[3]=2;LINK[5]=8;LINK[7]=14;LINK[8]=9;LINK[9]=18;LINK[11]=16;LINK[13]=5;LINK[14]=-1;LINK[16]=0;LINK[18]=7;
			System.out.println("Enter A number : ");
			int n=input.nextInt();
			while(p!=-1){
				if(n==LIST[p]){
					 x=p;
					 y=1;
					
				}else{
				p=LINK[p];
				
				}
			}
			if(y==1){
				System.out.println("Number is ound in location  "+x);
				
			}else
				System.out.println(" Number is not found  ");

	

	}
}
