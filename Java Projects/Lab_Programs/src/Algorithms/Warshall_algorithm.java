package Algorithms;

public class Warshall_algorithm {
	
	static int[][] A=new int[5][5];
	static int[][] P=new int[5][5];
	
	static int i,j,k;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warshall_algorithm ob=new Warshall_algorithm();
		for( i=1;i<=4;i++){
			for(j=1;j<=4;j++){
				A[i][j]=0;
			}
		}
				A[2][1]=1;
				A[3][1]=1;
				A[2][3]=1;
				A[4][3]=1;
				A[1][4]=1;
				A[2][4]=1;
				A[3][4]=1;
			
				System.out.println("Adjecency Matrix : ");
			
				for(i=1;i<=4;i++){
					System.out.println();
					for(j=1;j<=4;j++){
						System.out.print(A[i][j]+"\t");
					}
					
				}
				for(i=1;i<=4;i++){
					for(j=1;j<=4;j++){
						if(A[i][j]==0){
							P[i][j]=0;
							
						}
						else
						  P[i][j]=1;
					}
				}
				for(k=1;k<=4;k++){
					for(i=1;i<=4;i++){
						for(j=1;j<=4;j++){
							P[i][j]=ob.OR(ob.AND(P[i][j],P[i][k]),P[k][j]);
						}
					}
			
				
				}
				System.out.println("\nThe path Matrix is  :");
				for(i=1;i<=4;i++){
				  System.out.println();
				    for(j=1;j<=4;j++){
					   System.out.print(P[i][j]+"\t");	
					
				}
				}
		}
		

	private int OR(int l, int m) {
		// TODO Auto-generated method stub
		
		if(l==0 && m==0){
			return 0;
		}else
			return 1;

	}
	
	private int AND(int a, int b){
		if(a==1 && b==1){
			return 1;
		}else
			return 0;
	}

	}


 