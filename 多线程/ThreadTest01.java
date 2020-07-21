package thread;

/*
 * 创建多线程1.继承java.lang.Thread;
 * 2.重写run方法
 */
public class ThreadTest01 {

	public static void main(String[] args) {
		Thread t = new Processor();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main-->" + i);
		}
	}
}

class Processor extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("run-->" + i);
		}
	}
}
