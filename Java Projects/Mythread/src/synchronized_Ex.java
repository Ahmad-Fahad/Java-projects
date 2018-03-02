class Global{
	synchronized void CallMe(String mgs){
		System.out.print("["+mgs);
		try{
			
			Thread.sleep(1000);
			
		}
		catch(Exception E)
		{
			System.out.println("Exception Caught");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable{
	String mgs;
	Global Terget;
	Thread th;
	public Caller(Global Gb,String s)
	{
		Terget=Gb;
		mgs=s;
		th=new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Terget.CallMe(mgs);
	}
}
public class synchronized_Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Global obj=new Global();
		Caller obj1=new Caller(obj,"Hellow");
		Caller obj2=new Caller(obj,"Java");
		Caller obj3=new Caller(obj,"Programmer");
		try{
			obj1.th.join();
			obj3.th.join();
			obj2.th.join();
		}
		catch(Exception e){
			
		}

	}
}
