package DATA_STRUCTURE;
import java.util.Scanner;
public class STACK_push_pop {
	int MAX=5;
	int[] stack=new int[MAX];
	int top=-1;
	
	/**
	 * @param args
	 */
	public void pop(int j){
			if(top==-1){
				System.out.println("STACK IS EMPTY");
		
	}else{
		
		top=top-1;
		j=stack[top];
		System.out.println("MEMORY STATUS .........");
		System.out.println("MAX : "+MAX);
		System.out.println("TOP : "+top);
		System.out.println("ELEMENT DELETED : "+j);
		
	}
		
		
	}
	public void push(int i){
		if(top==MAX-1){
			System.out.println("STACK IS FULL");
		}else{
			top=top+1;
			stack[top]=i;
			System.out.println("MEMORY STATUS .......");
			System.out.println("MAX : "+MAX);
			System.out.println("TOP : "+top);
			System.out.println("ELEMENT : "+stack[top]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		STACK_push_pop ob=new STACK_push_pop();
		int i=0;
		do{
		
		System.out.println("ENTER 1 FOR PUSH && 2 FOR POP");
	    int m=in.nextInt();
		if(m==1){
			System.out.println("ENTER THE NUMBER WHICH YOU WANT TO INSERT IT'S NEXT INDEX : ");
			int e=in.nextInt();
			ob.push(e);
		}
		else if(m==2){
			System.out.println("ENTER THE NUMBER WHICH YOU WANT TO DELETE FROM IT'S LAST INDEX : ");
			int e=in.nextInt();
			ob.pop(e);
		
		}
		i++;
	
		}while(i<20);
	}

}

