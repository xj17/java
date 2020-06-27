package hotel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Hotel h = new Hotel();
		// h.print();
		while (true) {
			System.out.print("请输入要预定房间的编号:");
			Scanner sc = new Scanner(System.in);
			String no = sc.next();
			h.order(no);//预定
			h.print();//打印所有房间编号

		}
	}
}
