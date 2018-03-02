package Intermediate_java;

public class Fioghting_with_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] words={"AHAD","FAHAD","FARUK","FUAD"};
			
			for(String w : words){
				if(w.startsWith("FA")){
					System.out.println(w+" STARTS WITH FA");
					
				}
				if(w.endsWith("AD")){
					System.out.println(w+" ENDS WITH AD");
				}
			}
			
	}

}
