package DATA_STRUCTURE;

public class Polish_notation {
		
	static int STACK[]=new int[20];
	static int LINK[]=new int[20];
	static char P[]={'4','5','1','+','*','8','4','/','-'};
		static int TOP=-1,I=0,J=0;
		static int AVAIL=0;
		static String S;
		
		
		
		
		int top=-1;
		
		/**
		 * @param args
		 */
		public int pop(){
				if(top==-1){
					System.out.println("STACK IS EMPTY");
			
		}else{
			
			top=top-1;
			J=STACK[top];
			
		}
				return J;
			
			
		}
		public  void push(int i,int l){
			if(top==l-1){
				System.out.println("STACK IS FULL");
			}else{
				top=top+1;
				STACK[top]=i;
				
			}
			
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,A,B,RESULT = 0;
		Polish_notation ob=new Polish_notation();
		
		AVAIL=15;
		
		int l=P.length;
		
		
		//S=new String(P.toString()); 
		System.out.println("POSTFIX  EXPRESSION : "+P);
		 
		 P[l-1]=')';
		i=0;
		while(P[i]!=')'){
			if(ob.isdisit(P[i])){
				num=P[i];
				ob.push(num,l);
				
				
			}
			if(P[i]=='+'||P[i]=='-'||P[i]=='*'||P[i]=='/'||P[i]=='^'){
				A=ob.pop();
				B=ob.pop();
				
				if(P[i]=='+'){
					RESULT=A+B;
					
				}
				 if(P[i]=='-'){
					RESULT=B-A;
					
				}
				 if(P[i]=='*'){
					RESULT=A*B;
				}
				 if(P[i]=='/'){
					RESULT=B/A;
				}
				 if(P[i]=='^'){
					RESULT=ob.pow(B,A);
				}
				
				ob.push(RESULT,l);
				
				}
				i=i+1;
			}
		
		RESULT=ob.pop();
		System.out.println("RESULT : "+RESULT);
		}
	

	private static boolean isdisit(char c) {
		// TODO Auto-generated method stub
		if((c-'0')>=0 && (c-'0')<=9){
			return true;
		}else
		return false;
	}
	
	int pow(int x,int n){
		int y=1;
		for(int i=0;i<n;i++){
			y=y*x;
		}
		return y;
	}

}
