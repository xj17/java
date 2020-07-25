package thread;

/*
 * 线程优先级高的获取的CPU时间片相对多一些
 * 优先级1-10
 * 默认5
 */
public class ThreadTest04 {

	public static void main(String[] args) {
		// System.out.println(Thread.MAX_PRIORITY);//10
		// System.out.println(Thread.MIN_PRIORITY);//1
		// System.out.println(Thread.NORM_PRIORITY);//5
		Thread t1 = new Processor3();
		t1.setName("t1");
		Thread t2 = new Processor3();
		t1.setName("t2");
		System.out.println(t1.getPriority()); // 5
		// System.out.println(t2.getPriority()); //5
		// 设置优先级
		t1.setPriority(4);
		t2.setPriority(6);
		t1.start();
		t2.start();
	}

}

class Processor3 extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}
}
