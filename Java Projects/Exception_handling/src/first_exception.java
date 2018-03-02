
public class first_exception {
	static void Demo(){
		try{
			int x=12;
			int y=0;
			int z=x/y;
			System.out.println(z);
	//throw new ArithmeticException("Virus");	
	
	}
	
	catch(Exception e){
		System.out.println("Exception Found");
		
		throw e;
		
	}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Demo();
		}
		catch(Exception e){
			System.out.println("Exception found "+e);
		}
	}

}
