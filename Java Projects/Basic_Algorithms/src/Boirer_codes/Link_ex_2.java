package Boirer_codes;

public class Link_ex_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] INF0= new char[12];
		int[] LINK=new int[12];
		int p=0,START;
		INF0[9]='N';INF0[3]='O';INF0[6]=' ';INF0[11]='E';INF0[7]='X';INF0[10]='I';INF0[4]='T';
		LINK[9]=3;LINK[3]=6;LINK[6]=11;LINK[11]=7;LINK[7]=10;LINK[10]=4;LINK[4]=0;
		START=9;
		p=START;
		while(p!=0){
			System.out.print(INF0[p]);
			p=LINK[p];
		}
	}

}
