package huawei;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		int len = str.length();
		int n = 0;
		StringBuffer stb = new StringBuffer();

		for (int i = 0; i < len;) {
			if ("y".equals(str.charAt(i))) {
				stb.append("1");
				i = i + 2;
				System.out.println(stb.toString());
			} else if ("s".equals(str.charAt(i))) {
				if ("a".equals(str.charAt(i))) {
					stb.append("3");
					i = i + 3;
				} else if ("i".equals(str.charAt(i))) {
					stb.append("4");
					i = i + 2;
				}
			} else if ("e".equals(str.charAt(i))) {
				stb.append("2");
				i = i + 2;
			} else if ("w".equals(str.charAt(i))) {
				stb.append("5");
				i = i + 2;
			} else if ("l".equals(str.charAt(i))) {
				stb.append("6");
				i = i + 3;
			} else if ("q".equals(str.charAt(i))) {
				stb.append("7");
				i = i + 2;
			} else if ("b".equals(str.charAt(i))) {
				stb.append("8");
				i = i + 2;
			} else if ("j".equals(str.charAt(i))) {
				stb.append("9");
				i = i + 3;
			}
		}

		System.out.println(stb.toString());
	}
}
