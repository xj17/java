package thread;
/*
 * 类锁,类只有一个,所以锁是类级别的,只有一个.
 */
public class ThreadTest3 {
	public static void main(String []args) throws Exception {
		Thread t1=new Thread(new Processor11());
		Thread t2=new Thread(new Processor11());
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}
}
class Processor11 implements Runnable{
	public void run() {
		if("t1".equals(Thread.currentThread().getName())) {
			MyClass1.m1();
		}
		if("t2".equals(Thread.currentThread().getName())) {
			MyClass1.m2();
		}
	}
}
class MyClass1{
	//synchronized添加到静态方法上,线程执行此方法的时候会找类锁
	public synchronized static void m1() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("m1---");		
	}
	public static void m2() {
		System.out.println("m2---");
	}
}