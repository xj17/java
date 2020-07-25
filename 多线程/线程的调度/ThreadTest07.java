package thread;

//打断某线程的休眠
public class ThreadTest07 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Processor6());
		t.setName("t");
		t.start();
		Thread.sleep(5000);
		// 启动线程，5s后打断线程的休眠
		t.interrupt();

	}

}

class Processor6 implements Runnable {
	public void run() {
		try {
			Thread.sleep(10000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);

		}
	}
}
