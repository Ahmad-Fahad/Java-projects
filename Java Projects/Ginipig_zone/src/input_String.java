import java.util.Scanner;
public class input_String {
	public static void main(String args[]){
		int[] CREDIT=new int[9];
		double[] POINT=new double[9];
		String[] GRADE=new String[9];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<9;i++){
			CREDIT[i]=1;
			POINT[i]=1;
		}
	//	Scanner input=new Scanner(System.in);
		String[] str=new String[5];
		//String 
	//for(int i=0;i<5;i++){
//	str[i]=input.nextLine();
	//}
//	for(int j=0;j<5;j++){
	//System.out.println(str[j]);
	//}
	

	System.out.println("THEORITICAL.......");
	/*for(int i=0;i<5;i++){
		System.out.println("Enter your GPA of  subuject no "+(i+1)+" : ");
		GRADE[i]=input.nextLine();
	}
		for(int i=0;i<5;i++){
		System.out.println("Enter the Credit of the subuject : ");
		CREDIT[i]=input.nextInt();
		
	*/
		int g=0;
		String h;
		for(int i1=5;i1<9;i1++){
			System.out.printf("Enter your GPA of Sessional no %d : \n",g+1);
			GRADE[i1]=input.nextLine();
		
			System.out.printf("Enter the Credit of the subject  : ");
			CREDIT[i1]=input.nextInt();
		}
}
}
//}
