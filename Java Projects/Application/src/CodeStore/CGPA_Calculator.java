package CodeStore;
import javax.swing.JOptionPane;
public class CGPA_Calculator {
	

	

	
		public static void main(String[] args){
			// TODO Auto-generated method stub
			float[] CREDIT=new float[9];
			double[] POINT=new double[9];
			String[] GRADE=new String[9];
			
			for(int i=0;i<9;i++){
				CREDIT[i]=1;
				POINT[i]=1;
		}
			JOptionPane.showMessageDialog(null, ".......THEORITICAL.......");
			for(int i=0;i<5;i++){
				String GD=(String) JOptionPane.showInputDialog("Enter your GPA of  subuject no : "+(i+1));
				GRADE[i]=GD;
			
				String CD=JOptionPane.showInputDialog("Enter the Credit of the subuject NO "+(i+1)+": ");
			    float num=Float.parseFloat(CD);
			    CREDIT[i]=num;
			}
			JOptionPane.showMessageDialog(null, ".......PRACTICAL.......");
			int g=1;
			for(int i=5;i<9;i++){
				String GDE=(String) JOptionPane.showInputDialog("Enter your GPA of  subuject No "+g+" : ");
				GRADE[i]=GDE;
				
				String CDE=JOptionPane.showInputDialog("Enter the Credit of the subuject NO "+g+ ": ");
				float number=Float.parseFloat(CDE);
				CREDIT[i]=number;
				g++;
			}
			double TOTAL=0;
			for(int i1=0;i1<9;i1++){
			TOTAL=TOTAL+CREDIT[i1];
		}
		System.out.println(TOTAL);
		for(int j=0;j<9;j++){
			String s1=GRADE[j];		
			switch(s1)
			{
			case "A+":
				POINT[j]=4.00;
				break;
			case "A":
				POINT[j]= 3.75;
				break;
			case "A-":
				POINT[j]=3.50;
				break;
			case "B+":
				POINT[j]=3.25;
				break;
			case "B":
				POINT[j]=3.00;
				break;		
			case "C+":
				POINT[j]=2.50;
				break;
			case "C":
				POINT[j]=2.25;
				break;
			case "D":
				POINT[j]=2.00;
				break;
			case "F":
				POINT[j]=0.00;
				break;
			}
		}
		double SUM=0;
		for(int i1=0;i1<9;i1++){
			SUM=SUM+POINT[i1]*CREDIT[i1];
		}
		double cgpa=SUM/TOTAL;
		//JOptionPane.showMessageDialog(null, "Your CGPA is "+cgpa,"BEST WISHES FOR YOU",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "YOUR CGPA : " +cgpa);
		

			
		}
	}



