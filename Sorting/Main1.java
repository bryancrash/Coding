package Sorting;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("��������Ե����ָ���:");
		int N=scanner.nextInt();
		
		//����ָ������������
		System.out.println("���ָ������������:");
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
