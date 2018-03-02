import java.lang.*;
class AnswerisTooSmallException extends Exception{
	 AnswerisTooSmallException(String msg){
		super(msg);
	}
} 
public class MyException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=100000;
		float z=0;
		try{
			z=(float)x/(float)y;
			if(z<0.001){
				throw new  AnswerisTooSmallException("Result is too small");
			}
		}
		catch(AnswerisTooSmallException obj){
			System.out.println("Exception caught : "+obj);
		}
		finally{
			System.out.println("Terminatination successful");
		}

	}

}
