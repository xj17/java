package thread;

public class ThreadTest03 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();// 获取当前线程对象
		System.out.println(t.getName());// main
		Thread t1 = new Thread(new Processor2());
		// t1.setName("t1");
		t1.start();
	}

}

class Processor2 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();// t保存的内存地址指向的线程是"主线程对象"
		System.out.println(t.getName());// Thread-0
	}
}