package DATA_STRUCTURE;

import java.util.Scanner;

public class DFS {
	void dfs(int[][] adj,int n,int[] visited,int node){
		int i;
		visited[node]=1;
		System.out.print(node+1);
		for(i=0;i<n;i++){
			if(adj[node][i]==1 && visited[i]==0){
				dfs(adj,n,visited,i);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS ob=new DFS();
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
		System.out.println("\n\t==>DFS<==\n\t ");
		ob.dfs(adj,n,visited,node-1);

	}

}
