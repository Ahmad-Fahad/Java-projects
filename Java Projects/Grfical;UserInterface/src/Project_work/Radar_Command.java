package Project_work;
import java.util.Scanner;

public class Radar_Command {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		String s=in.nextLine();
		int y=in.nextInt();
		String s1=in.nextLine();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				
				if(i==x && j==y){
					System.out.print("=!=");
				}
				
					System.out.print("...");
				
				
			}
			System.out.println();

	}

}
}
