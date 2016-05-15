package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("请输入答案个数以及需要输出的前M大的和:");
		Scanner scan=new Scanner(System.in);
		
		int N=scan.nextInt();
		int M=scan.nextInt();
		
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=scan.nextInt();
		}
		
		int[] b=new int[N*(N-1)/2];
		int index=0;
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				b[index++]=a[i]+a[j];
			}
		}
		
		Arrays.sort(b);
		for(int p=0;p<M;p++){
			System.out.println(b[p]);
		}

	}

}
