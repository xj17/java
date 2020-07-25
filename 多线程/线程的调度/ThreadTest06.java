package thread;

public class ThreadTest06 {
	public static void main(String[] args) throws Exception {
		Thread t = new Processor5();
		t.setName("t");
		t.start();
		t.sleep(5000);// 等同于Thread.sleep;阻塞的是当前线程，与t线程无关
		System.out.println("Hello world");

	}
}

class Processor5 extends Thread {
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);

		}
	}
}
