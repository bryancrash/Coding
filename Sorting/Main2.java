package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("������������ݸ���N:");
		int N=scanner.nextInt();
		
		System.out.println("�����������������ǰM����:");
		int M=scanner.nextInt();
		
		//����N��������в���
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=scanner.nextInt();
		}
		
		int[] max=new int[N*(N-1)/2];
		int index=0;
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				max[index]=a[i]+a[j];
				index++;
			}
		}
		
		Arrays.sort(max);
		for(int i=0;i<M;i++){
			System.out.println(max[(N*(N-1)/2)-i-1]);
		}

	}

}
