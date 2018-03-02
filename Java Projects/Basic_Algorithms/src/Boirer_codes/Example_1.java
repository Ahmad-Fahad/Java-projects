package Boirer_codes;

public class Example_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={100,232,500,300,400,76,45,123,345,56};
		int n=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]>=300){
				n++;
			}
		}
		System.out.println("company sold auto over 300 in "+n+" times");
		for(int j=0;j<10;j++){
			if(a[j]>=300){
				int m=j+1932;
				System.out.println("In "+m+" The Number of Autos "+a[j]);
			}
		}

	}

}
