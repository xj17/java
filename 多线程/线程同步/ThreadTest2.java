package thread;

public class ThreadTest2 {
	public static void main(String[] args) throws Exception {
		MyClass mc=new MyClass();
		Processor10 p=new Processor10(mc);
		Thread t1=new Thread(p);
		t1.setName("t1");
		Thread t2=new Thread(p);
		t2.setName("t2");
		t1.start();
		//延迟  使t1先执行
		Thread.sleep(1000);
		t2.start();
	}
}

class Processor10 implements Runnable {
	MyClass mc;
	Processor10(MyClass mc){
		this.mc=mc;
	}
	public void run() {
		if(Thread.currentThread().getName().equals("t1")) {
			mc.m1();
		}
		if(Thread.currentThread().getName().equals("t2")) {
			mc.m2();
		}
	}
}

class MyClass {
	public synchronized void m1() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("m1---");
	}

	public void m2() {
		System.out.println("m2---");
	}
}