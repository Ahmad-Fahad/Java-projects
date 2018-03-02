
public class Using_throws {
	
	 
	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
		int[] x=new int [-3];
		int y=5,d;
	
		
		
		
			d=x[2]/y;
		}
		catch(ArithmeticException a){
			System.err.println(a);
		}
		catch(ArrayStoreException b){
			System.err.println(b);
		}
		catch(ArrayIndexOutOfBoundsException c){
			System.err.println(c);
		}
		catch(NegativeArraySizeException d){
			System.err.println(d);
		}
		finally{
			
				System.err.println("not found ");
			}
		}
	}


