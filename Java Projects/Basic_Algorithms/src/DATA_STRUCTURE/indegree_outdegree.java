package DATA_STRUCTURE;
import java.util.Scanner;
public class indegree_outdegree {
		/**
	 * @param args
	 */
	public int indeg(int DATA[][],int v,int n){
		int indegree=0;
		for(int i=0;i<n;i++){
			if(DATA[i][v]==1){
				indegree++;
			}
		}
				return indegree;
	}
	public int outdeg(int DATA[][],int v,int n){
		int outdegree=0;
		for(int i=0;i<n;i++){
			if(DATA[v][i]==1){
				outdegree++;
			}
		}
				return outdegree;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		indegree_outdegree ob=new indegree_outdegree();
		System.out.println("ENTER THE NUMBER OF NODES  : ");
		int n=in.nextInt();
		int[][] DATA=new int[n][n];
		System.out.println("ENTER THE EDGE OF NODES  : ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.printf("EDGE OF NODE %d TO %d : ",(i+1),(j+1));
				DATA[i][j]=in.nextInt();
			}
		}
		int p=0;
		for(int k=0;k<n;k++){
			p=ob.indeg(DATA,k,n);
			System.out.printf("\nTHE INDEGREE OF %d : %d",(k+1),p);
			p=ob.outdeg(DATA,k,n);         ;
			System.out.printf("\nTHE OUTDEGREE OF %d : %d",(k+1),p);
			
			
		}
		

	}

}
