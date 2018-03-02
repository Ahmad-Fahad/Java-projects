package Enum;

public class ex1 {

	/**
	 * @param args
	 */
	public enum season{WINTER,SUMMER,AUTUMN};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	season s=season.WINTER;
		System.out.println(s);
		for(season s1 : season.values()){
			System.out.println(s1);
			
		}

	}

}
