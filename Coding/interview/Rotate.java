package interview;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ÇëÊäÈë¾ØÕóµÄ½×ÊıN:");
		int N=scanner.nextInt();
		
		int m[][]=new int[N][N];
		System.out.println("ÇëÊäÈëN*N¾ØÕó£»");
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				m[i][j]=scanner.nextInt();
			}
		}
		
		int k[][]=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				k[i][j]=m[N-j-1][i];
			}
		}
		
		System.out.println(k);
	}

}
