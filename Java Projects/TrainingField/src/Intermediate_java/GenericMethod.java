package Intermediate_java;

public class GenericMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] i={1,2,3,4,5,6,7,9};
		Character[] c={'A','b','d','u','l','l','a','h'};
		
		PrintMe(c);
		 PrintMe(i);
		

	}

	private static <T>  void PrintMe(T[] x) {
		// TODO Auto-generated method stub
		for(T b : x){
			System.out.printf("%s",b);
			//
		}
		System.out.println();
		
	}

}
