package huawei;

import java.util.Scanner;

public class Main1 {
	/**
	 * 按要求分解字符串，输入两个数M，N；M代表输入的M串字符串，N代表输出的每串字符串的位数， 不够补0。例如：输入2,8， “abc”
	 * ，“123456789”， 则输出为“abc00000”,“12345678“,”90000000”
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();
		int N = scanner.nextInt();

		String[] str = new String[M];
		for (int i = 0; i < M; i++) {
			str[i] = scanner.next();
		}

		for (int j = 0; j < M; j++) {
			if (str[j].length() < N) {
				StringBuffer stb = new StringBuffer(str[j]);
				for (int p = 0; p < N - str[j].length(); p++) {
					stb.append("0");
				}
				System.out.println(stb.toString());
			} else if (str[j].length() >= N) {
				String st = str[j].substring(0, N);
				System.out.println(st);
			}
		}

	}

}
