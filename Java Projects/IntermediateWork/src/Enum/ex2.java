package Enum;

public class ex2 {

	/**
	 * @param args
	 */
	enum season{
		winter(12),fall(2),rainy(3);
		private int val;
		season(int val){
			this.val=val;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(season s:season.values()){
			System.out.println(s+" "+s.val);
		}

	}

}
