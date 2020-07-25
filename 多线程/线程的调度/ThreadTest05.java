package thread;

/*
 * Thread.sleep(毫秒) 静态方法
 * 阻塞当前线程，腾出cpu，让给其他线程
 */
public class ThreadTest05 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Processor4();
		t1.setName("t1");
		t1.start();
		// 阻塞主线程
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
			Thread.sleep(500);
		}
	}

}

class Processor4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}