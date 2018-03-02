package Experiment;

public class timer implements Runnable{
	static timer t=new timer();
	static Thread th=new Thread(t);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		th.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int m1=0,m2=1;
		for(int l=0;l<2;l++){
		for(int k=0;k<5;k++){
	      for(int j=0;j<5;j++){
	    	 for(int i=0;i<5;i++){
 	           	for(int y=0;y<5;y++){
	        		for(int x=0;x<5;x++){
	            		System.out.println("      "+y+"   " +x);
	       		try {
				th.sleep(1);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
	       		 
 			}
		}
	           	
       System.out.print("             "+j+"  "+i);	
		 }
		 
	 }
	 System.out.print("        "+l+"   "+k);
		}
	 
		}
		th.stop();
	 }
}
