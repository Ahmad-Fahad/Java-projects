package Dynamic_Connectivity;

import java.util.Scanner;

public class UnionFind {

	/**
	 * @param args
	 */
	public static int[] id;
	
	public void initialise(int n){
		id=new int[n];
		for(int i=0;i<id.length-1;i++){
			id[i]=i;
		}
	}
	public static boolean connected(int p,int q){
		if(id[p]==id[q]){
			return true;
		}else{
		return false;
		}
	}
	public void union(int p,int q){
		int pid=id[p];
		int qid=id[q];
		for(int i=0;i<id.length-1;i++){
			if(pid==id[i]){
				id[i]=qid;
			}
		}
	}
	public static void main(String[] args)
	{ 
		System.out.println("Enter the number of nodes : ");
		Scanner ii=new Scanner(System.in);
		int n=ii.nextInt();
		UnionFind uf=new UnionFind();
		uf.initialise(n);
		
		int p=0,q=0;
	while(p!=-1){
		p=ii.nextInt();
		q=ii.nextInt();
		if(!connected(p,q)){
			uf.union(p,q);
		}
		}
		for(int i=0;i<id.length-1;i++){
			System.out.println("id["+i+"]"+" ---->"+id[i]);
		}
		
	}
	
 

}
