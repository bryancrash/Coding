package interview;

import java.util.Scanner;

public class FoldPaper {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÕÛµþ´ÎÊý:");
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		
		FoldPaper foldPaper=new FoldPaper();
		
		foldPaper.printAllFolds(N);

	}
	public void printAllFolds(int N){
		
		printProcess(1,N,true);
		
	}
	private void printProcess(int i, int N, boolean down) {
		int j=0;
		if(i>N){
			return;
		}
		printProcess(i+1,N,true);
		System.out.print(down?"down":"up"+" ");
		printProcess(i+1,N,false);
		
	}


}
