package DATA_STRUCTURE;
import java.util.Scanner;
public class BFS {
	void bfs(int[][] adj,int n,int[] visited,int node){
		int nd,f=-1,r=-1;
		int[] q=new int[20];
		visited[node]=1;
		q[++r]=node;
		while(f!=r){
			nd=q[++f];
			System.out.print(nd+1);
			for(int i=0;i<n;i++){
				if(adj[nd][i]==1 && visited[i]==0 ){
					visited[i]=1;
					q[++r]=i;
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS ob=new BFS();
		Scanner in=new Scanner(System.in);
		int[][] adj=new int[10][10];
		int[] visited=new int[10];
		int n,e,node,v1,v2;
		System.out.println("Enter the number of Nodes : ");
		n=in.nextInt();
		System.out.println("Enter the node of edges : ");
		e=in.nextInt();
		System.out.println("Enter the edges : ");
		for(int i=0;i<e;i++){
			v1=in.nextInt();
			v2=in.nextInt();
			adj[v1-1][v2-1]=adj[v2-1][v1-1]=1;
		}
		System.out.println("Enter the starting node  : ");
		node=in.nextInt();
		System.out.println("\n\t==>BFS<==\n\t ");
		ob.bfs(adj,n,visited,node-1);
	}

}
