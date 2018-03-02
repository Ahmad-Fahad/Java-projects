package Project_work;
import java.util.Scanner;
import java.io.*;

public class CGPA_calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] CREDIT=new int[9];
		double[] POINT=new double[9];
		String[] GRADE=new String[9];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<9;i++){
			CREDIT[i]=1;
			POINT[i]=1;
		}
		System.out.println("THEORITICAL.......");
		for(int i=0;i<5;i++){
			System.out.println("Enter your GPA of  subuject no ---"+(i+1)+" : ");
			GRADE[i]=input.nextLine();
			System.out.println("Enter the Credit of the subuject : ");
			CREDIT[i]=input.nextInt();
			
		}
		System.out.println("PRACTICAL.......");
		for(int i=5;i<9;i++){
			System.out.println("Enter your GPA of subuject no ---"+(i+1)+" : ");
			GRADE[i]=input.nextLine();
			System.out.println("Enter the Credit of the subject  : ");
			CREDIT[i]=input.nextInt();
		}
		int TOTAL=0;
		for(int i=0;i<9;i++){
			TOTAL=TOTAL+CREDIT[i];
		}
		for(int j=0;j<9;j++){
			if(GRADE[j]=="A+"){
				POINT[j]=4.00;
			}
			if(GRADE[j]=="A"){
				POINT[j]=3.75;
			}
			if(GRADE[j]=="A-"){
				POINT[j]=3.50;
			}
			if(GRADE[j]=="B+"){
				POINT[j]=3.25;
			}
			if(GRADE[j]=="B"){
				POINT[j]=3.00;
			}
			if(GRADE[j]=="B-"){
				POINT[j]=2.75;
			}
			if(GRADE[j]=="C+"){
				POINT[j]=2.50;
			}
			if(GRADE[j]=="C"){
				POINT[j]=2.25;
			}
			if(GRADE[j]=="D"){
				POINT[j]=2.00;
			}
			if(GRADE[j]=="F"){
				POINT[j]=0.00;
			}
		}
		double SUM=0;
		for(int i=0;i<9;i++){
			SUM=SUM+POINT[i]*CREDIT[i];
		}
		double cgpa=SUM/TOTAL;
		System.out.println("YOUR CGPA  : "+cgpa);
		

	}

}
