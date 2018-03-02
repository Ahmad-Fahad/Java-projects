package Experiment;

public class timer2 implements Runnable{
	static timer2 t=new timer2();
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
		for(int k=1;k<12;k++){
		for(int j=0;j<60;j++){
			for(int i=0;i<60;i++){
				if(i<10 && j<10){
				System.out.println("     "+0+i+"     "+0+j);
				
				
			}else if(i<10 && j>=10){
				System.out.println("     "+0+i+"   "+j);
		}else if(i>=10 && j<10){
			System.out.println("     "+i+"   "+0+j);

		}else if(i>=10 && j>=10){
			System.out.println("    "+i+"    "+j);
		}
			}
	
		}
		System.out.println("    "+k);
		}
	th.stop();	
	}

}
