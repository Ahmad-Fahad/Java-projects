package Experiment;

public class polymorphism {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 base b=new derived();
		 b.func();

	}

}
  class base{
	
	public void func(){
		System.out.println("i m in base ");
	}
}
 class derived extends base{
	
	public void func(){
		super.func();
		System.out.println("i m in derived ");
	}
}