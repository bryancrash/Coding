package toutiao;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int k = scan.nextInt();

		int index = 0;
		int i = 0;
		while (index != k) {
			if (x + (i++) == (x | (i++))) {
				index++;
			}
		}
		System.out.println(i);

	}

}
