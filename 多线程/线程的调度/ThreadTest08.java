package thread;
//打断某线程的休眠_升级
public class ThreadTest08 {

	public static void main(String[] args) throws Exception {
		Processor7 p = new Processor7();
		Thread t = new Thread(p);
		t.setName("t");
		t.start();
		Thread.sleep(5000);
		p.run = false;

	}

}

class Processor7 implements Runnable {
	boolean run = true;

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (run) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName() + "--->" + i);
			} else {
				return;
			}
		}
	}
}
