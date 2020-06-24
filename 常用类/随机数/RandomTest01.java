package Number;

import java.util.Random;

public class RandomTest01 {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(101)); // 生成五个随机数(会重复)

		}
	}
}
