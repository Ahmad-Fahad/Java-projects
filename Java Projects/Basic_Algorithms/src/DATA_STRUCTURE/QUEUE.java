package DATA_STRUCTURE;
import java.util.Scanner;
public class QUEUE {
	int MAX=5,x=0;
	int[] queue=new int[MAX];
	int rear=-1;
	int front=-1;

	/**
	 * @param args
	 */
	public void push(int i){
		if(rear==MAX-1){
			System.out.println("QUEUE IS FULL");
		}else{
			rear=rear+1;
			queue[rear]=i;
			System.out.println("MEMORY STATUS.........");
			System.out.println("REAR : "+rear);
			System.out.println("FRONT : "+front);
			System.out.println("INSERTED NUMBER : "+queue[rear]);
		}
	}
	public void pop(){
		if(front==rear){
			System.out.println("QUEUE IS EMPTY");
		}else{
			front=front+1;
			x=queue[front];
			System.out.println("MEMORY STATUS..........");
			System.out.println("REAR : "+rear);
			System.out.println("FRONT : "+front);
			System.out.println("THE DELETED NUMBER IS : "+x);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,m=0,k1=0;
		QUEUE ob=new QUEUE(); 
		Scanner in=new Scanner(System.in);
		do{
			System.out.println("ENTER 1 FOR INSERTION 2 FOR DELETION :");
			m=in.nextInt();
			if(m==1){
				System.out.println("ENTER THE NUMBER WHICH YOU WANT TO INSERT : ");
				k1=in.nextInt();
				ob.push(k1);
			}else{
				
				ob.pop();
				
			}
			k++;
		}while(k<20);
	}

}
