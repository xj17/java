package Number;

import java.util.Random;

public class RandomTest02 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[5];
		int index = 0;
		while (index < 5) {
			int temp = r.nextInt(6);
			if (temp != 0 && !contains(a, temp)) {
				a[index++] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static boolean contains(int[] a, int temp) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == temp) {
				return true;
			}

		}
		return false;
	}
}
