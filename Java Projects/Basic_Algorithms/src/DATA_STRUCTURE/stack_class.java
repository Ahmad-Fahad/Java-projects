package DATA_STRUCTURE;

import java.util.Scanner;

public class stack_class {
	int top=-1;
	int[] stack=new int[5];
	int max=5;
	int k=0;
	/**
	 * @param args
	 */
	
	public void push(int i){
		if(top==max-1){
			System.out.println("\nOVERFLOW\n");
			return;
		}
		else{
			top=top+1;
			stack[top]=i;
			System.out.println("TOP="+top);
			System.out.println("Value="+stack[top]);
		}
		
	}
	public int pop(){
		if(top==-1){
			System.out.println("\nOVERFLOW\n");
			return 0;
		}
		else{
			top=top-1;
			k=stack[top];
			System.out.println("top : "+top);
		return k;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a,d,n; 
				stack_class ob=new stack_class();
				Scanner in=new Scanner(System.in);
				d=5;
				while(d>=0){
				System.out.println("Enter 1 to push 2 to pop  ");
				int l=in.nextInt();
				if(l==1){
					System.out.println("Enter the value u wanna push ");
					int x=in.nextInt();
					ob.push(x);
				}
				if(l==2){
					int g=ob.pop();
					System.out.println("The number deleted : "+g);
					
					
				}
				d--;
				}
	}

}
