package Dynamic;

import java.util.Scanner;

public class Doing {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		//�����������������
		System.out.println("�����������������:");
		int a=scanner.nextInt();
		String[] m=new String[a];
		int[] n=new int[a];
		int[] p=new int[a];
		
		//������Ӧ�Ĳ�������
		for(int i=0;i<a;i++){
			m[i]=scanner.nextLine();
			n[i]=scanner.nextInt();
			p[i]=scanner.nextInt();
		}
		
		

	}

}
