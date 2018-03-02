package Intermediate_java;

public class Generic_Compare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(12,21,2));
		System.out.println(max("H","Z","A"));
	}

	private static <K extends Comparable<K>>K max(K a, K b, K c) {
		// TODO Auto-generated method stub
		K mx=a;
		if(b.compareTo(a)>0){
			mx=b;
		}
		if(c.compareTo(mx)>0){
			mx=c;
		}
		return mx;
	
	}
	

}
