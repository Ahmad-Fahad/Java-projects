package CodeExp;

import java.util.Scanner;

public class CodeEqn {

	/**
	 * @param args
	 */
	public void height(double angle,double v){
		double h=v*v*Math.sin(angle)*Math.sin(angle);
		double hr=h/(2*9.81);
		System.out.println("Heiggt : "+hr);
		
	}
	public void time(double angle,double v){
		double h=2*v*Math.sin(angle);
		double hr=h/9.81;
		System.out.println(" Time : "+hr);
	}
	public void range(double angle,double v){
		double h=v*v*Math.sin(2*angle);
		double hr=h/9.81;
		System.out.println("Range : "+hr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=0,height=0,range=0;
		double v=0,angle=0,g=9.81;
		Scanner ii=new Scanner(System.in);
		System.out.println("Case : ");
		int k=ii.nextInt();
		System.out.println("what will be measured : \n1.For Height\n2.Time\n3.Range");
		for(int i=0;i<k;i++){
			int n=ii.nextInt();
		System.out.print("Angle : ");
		angle=ii.nextDouble();
		System.out.print("Velocity : ");
		v=ii.nextDouble();
		CodeEqn cc=new CodeEqn();
		
		switch (n) {
		case 1:
			cc.height(angle,v);
			break;
		case 2:
			cc.time(angle,v);
			break;
		case 3:
			cc.range(angle,v);
			break;
		default:
			break;
		}
	}

}
}