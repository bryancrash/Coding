package Dynamic;

import java.util.Scanner;

public class Doing {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		//输入测试用例的数量
		System.out.println("请输入测试用例数量:");
		int a=scanner.nextInt();
		String[] m=new String[a];
		int[] n=new int[a];
		int[] p=new int[a];
		
		//输入相应的测试数据
		for(int i=0;i<a;i++){
			m[i]=scanner.nextLine();
			n[i]=scanner.nextInt();
			p[i]=scanner.nextInt();
		}
		
		

	}

}
