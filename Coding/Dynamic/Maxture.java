package Dynamic;

import java.util.Scanner;

public class Maxture {

	public static void main(String[] args) {
		
		
	   boolean g=chkMixture("ABC", 3, "12C", 3, "A12BCC", 6);
	   System.out.println(g);

	}
	
	public static boolean chkMixture(String A, int n, String B, int m, String C, int v) {
        boolean dp[][]=new boolean[n][m];
        if(n+m!=v){
            return false;
        }
       for (int i = 0; i <n ;i++){
		for (int j = 0; j <m ; j++)
		{
			if (i == 0 && j == 0) 
				continue;

			if (i>0){
				if (A.charAt(i - 1) == C.charAt(i + j - 1)){
					dp[i][j] = dp[i][j] || dp[i - 1][j];
				}
			}
			if (j>0){
				if (B.charAt(j - 1) == C.charAt(i + j - 1)){
					dp[i][j] = dp[i][j] || dp[i][j - 1];
				}
			}
		}
       }
        return dp[n-1][m-1];
    }

}
