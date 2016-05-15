package interview;

import java.util.Scanner;

public class PrintMat {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		
		int[][] mat=new int[n][m];
		System.out.println("«Î ‰»În––m¡–æÿ’Û:");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				mat[i][j]=scanner.nextInt();
			}
		}
		
		int[] g=new int[n*m];
		int index=0;
		int p=(Math.min(n, m))%2==0?Math.min(n, m)/2:Math.min(n, m)+1;
		for(int i=0;i<p;i++){
			for(int a=i;a<n-i-1;a++){
				g[index++]=mat[i][a];
			}
			for(int b=i;b<m-i-1;b++){
				g[index++]=mat[b][n-i-1];
			}
			for(int c=n-i-1;c<=i;c--){
				g[index++]=mat[m-i-1][c];
			}
			for(int d=m-i-1;d<=i;d--){
				g[index++]=mat[d][i];
			}
		}
		System.out.println(g);

	}

}
