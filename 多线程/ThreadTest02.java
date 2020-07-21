package thread;
/*
 * 创建多线程1.继承java.lang.Runnable接口
 * 2.实现run方法
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		Thread t=new Thread(new Processor1());
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main-->" + i);
		}
	}
}
class Processor1 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run-->"+i);
		}
	}
}