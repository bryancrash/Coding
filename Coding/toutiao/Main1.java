package toutiao;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = scan.nextLine();
		}

	}

}
