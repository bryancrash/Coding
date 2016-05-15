package huawei;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.nextLine();

			int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'F') {
					sum += 15 * (Math.pow(16, str.length() - i - 1));
				} else if (str.charAt(i) == 'E') {
					sum += 14 * (Math.pow(16, str.length() - i - 1));
				} else if (str.charAt(i) == 'D') {
					sum += 13 * (Math.pow(16, str.length() - i - 1));
				} else if (str.charAt(i) == 'C') {
					sum += 12 * (Math.pow(16, str.length() - i - 1));
				} else if (str.charAt(i) == 'B') {
					sum += 11 * (Math.pow(16, str.length() - i - 1));
				} else if (str.charAt(i) == 'A') {
					sum += 10 * (Math.pow(16, str.length() - i - 1));
				} else {
					sum += Integer.valueOf(str.charAt(i))
							* (Math.pow(16, str.length() - i - 1));
				}
			}
			System.out.println(sum);
		}

	}

}
