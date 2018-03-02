package Dynamic_Connectivity;

public class QuickUnion {

	/**
	 * @param args
	 */
	public static int[] id;
	public void inittialise(int n){
		id=new int[n];
		for(int i=0;i<id.length-1;i++){
			id[i]=i;
		}
	}
	public int root(int i){
		while(id[i]!=i){
			i=id[i];
			
		}
		return i;
	}
	public boolean connected(int p,int q){
		return root(p)==root(q);
	}
	
	public void union(int p,int q){
		int i=root(p);
		int j=root(q);
		id[i]=j;
	}
	/*
	 * private int root(int i)
{
while (i != id[i])
{
id[i] = id[id[i]];
i = id[i];
}
return i;
}
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
