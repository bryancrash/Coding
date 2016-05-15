package huawei;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long m = scanner.nextLong();
		StringBuffer stb = new StringBuffer();

		for (long i = 2; i < m; i++) {
			if (m % i == 0) {
				long k = (long) Math.sqrt(i);
				for (int j = 1; j < k; j++) {
					if (i % j == 0) {
						stb.append("i");
						stb.append(" ");
						m = m / i;
					}
				}
			}
			if (m == 1) {
				break;
			}
		}
		System.out.println(stb.toString());

	}

}
