package bianmei;

public class Program {
	public static void main(String[] args) {
		float[] a = new float[] { (float) 7.5398, (float) 6.5398, 1, 1 };
		int[] c = puzll(a);
		System.out.println(c);
	}

	public static int[] puzll(float[] a) {
		int index = 0;
		int[] b = new int[a.length];
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			float temp;
			int c = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
					index = min;
				}
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;

			if (i == 0) {
				b[index] = 0;
			} else {
				if (a[i] == a[i - 1]) {
					b[index] = c;
				} else {
					b[index] = i;
				}
			}
			c = b[index];
		}
		return b;
	}

}
