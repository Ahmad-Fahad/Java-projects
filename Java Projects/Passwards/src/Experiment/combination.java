package Experiment;

public class combination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for(a=1;a<=3;a++){
			for(b=1;b<=3;b++){
				for(c=1;c<=3;c++){
					System.out.println(a+" "+b+" "+c);
				}

				
			}

			
		}
		
		System.out.println("In Unique mode : ");
		for(a=1;a<=3;a++){
			for(b=1;b<=3;b++){
				for(c=1;c<=3;c++){
					if(b!=a && c!=b && c!=a){
					System.out.println(a+" "+b+" "+c);
				}

				}
			}

			
		}
		System.out.println("In Unique mode for 4 val : ");
		for(a=1;a<=9;a++){
			for(b=1;b<=9;b++){
				for(c=1;c<=9;c++){
					for(int d=1;d<=9;d++){
					if(b!=a && c!=b && c!=a && d!=c && d!=b && d!=a){
					System.out.println(a+" "+b+" "+c+" "+d);
				}

				}
				}
			}

			
		}




	}

}
