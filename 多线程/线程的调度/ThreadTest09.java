package thread;


public class ThreadTest09 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Processor8());
		t.setName("t");
		t.start();
		t.join();//将t和主线程合并 -->单线程
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}

}

class Processor8 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}
}