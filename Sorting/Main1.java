package Sorting;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入测试的数字个数:");
		int N=scanner.nextInt();
		
		//输入指定个数的数字
		System.out.println("输出指定个数的数字:");
		int res=0;
		int m;
		for(int i=0;i<N;i++){
			m=scanner.nextInt();
			int cnt=0; 
			if(cnt==0){
				res=m;
				cnt++;
			}else if(m!=res){
				cnt--;
			}else if(m==res){
				cnt--;
			}
		}
		System.out.println(res);
	}

}
