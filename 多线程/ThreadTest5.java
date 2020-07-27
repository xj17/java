package thread;

//守护线程
public class ThreadTest5 {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Processor12();
		t1.setName("守护线程");
		t1.setDaemon(true);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
			Thread.sleep(1000);
		}
	}

}

class Processor12 extends Thread {
	public void run() {
		int i = 0;
		while (true) {
			i++;
			System.out.println(Thread.currentThread().getName() + "-->" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
