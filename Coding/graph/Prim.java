package graph;

public class Prim {

	public static void main(String[] args) {
		Prim p=new Prim();
		p.prim(verNum-1, weight);

	}
	
	static int m=Integer.MAX_VALUE;
	static int[][] weight={
		   {0, 0, 0, 0, 0, 0},  
		   {0, m, 6, 9, 5, 13},  
		   {0, 6, m, 6,7,8},  
		   {0, 9,6,m,9,3},  
		   {0, 5,7,9,m,3},  
		   {0,13,8,3,3,m}  
		 };
	static int verNum=weight.length;
	static int[] lowerW=new int[verNum];
	static int[] edge=new int[verNum];
	static boolean[] checked=new boolean[verNum];
	
	public void  prim(int n,int[][]w){
		checked[1]=true;//抽取第一个顶点
		for(int i=1;i<n;i++){//初始化顶点集合
			lowerW[i]=w[1][i];
			edge[i]=1;
			checked[i]=false;
		}
		
		for(int i=1;i<n;i++){
			int min=Integer.MAX_VALUE;
			int j=1;
			for(int k=2;k<=n;k++){
				if(lowerW[k]<min&&(!checked[k])){
					min=lowerW[k];
					j=k;
				}
			}
			
			if(i<n){
				System.out.println(j+"-->"+edge[j]);
			}
			
			checked[j]=true;
			
			for(int k=2;k<=n;k++){
				if((w[j][k]<lowerW[k])&&(!checked[k])){
					lowerW[k]=weight[j][k];
					edge[k]=j;
				}
			}
		}
	}
		
}
