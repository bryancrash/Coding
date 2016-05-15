package bianmei;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int c = Puzzle(a);
		System.out.println(c);
	}

	public static int Puzzle(int[] a) {
		if (a.length == 0) {
			return a[0];
		} else {
			Arrays.sort(a);
			return a[1];
		}
	}

}
