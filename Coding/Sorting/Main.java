package Sorting;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(scanner.hasNext()){
			int str=scanner.nextInt();
			System.out.println(str);
			
		}
		
		//输入一行数字
		System.out.println("请输入一行数字:");
		String str=scanner.nextLine();
		
		String[] st=str.split("5");
		
		
		
		int m=st.length;
		int[] n=new int[m];
		
		for(int i=0;i<m;i++){
			n[i]=Integer.parseInt(st[i]);
		}
		
		for(int j=1;j<m;j++){
			int temp;
			if(n[j-1]>n[j]){
				temp=n[j-1];
				n[j-1]=n[j];
				n[j]=temp;
			}
		}
	for(int q=0;q<m;q++){
		System.out.println(n[q]);
	}

	}

}
