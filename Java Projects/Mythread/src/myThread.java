class A extends Thread{
	public void run(){
		display();
	
		for(int i=1;i<15;i++){		
		System.out.println("Inside the thread .....A i="+i);
		if(i%2==0){
		yield();
		}
		try{
			sleep(1000);
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
		}
		System.out.println("exit from A");
	}

		
	private void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside");
	}
}
class B extends Thread{
	@SuppressWarnings("deprecation")
	public void run(){
		for(int j=0;j<15;j=j+2){
		System.out.println("Inside the thread .....B j="+j);
		if(j==4){
			stop();
		}
		
		
		}
		System.out.println("exit from B");
	}
}
public class myThread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		A ob=new A();
		B ot=new B();
		System.out.println("start .....");
		ob.start();
		ot.start();
		System.out.println("exit .....");
		//Thread.sleep(10000000);
		ob.setPriority(Thread.MAX_PRIORITY);
		ot.setPriority(Thread.MIN_PRIORITY);
	}

}
