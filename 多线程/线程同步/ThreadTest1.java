package thread;

//同时对同一个账户进行取款操作
public class ThreadTest1 {
	public static void main(String[] args) {
		Account act=new Account("actno-001",5000.0);
		Processor9 p=new Processor9(act);
		//两个线程共享同一个账户(通过构造方法传参)
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t1.start();
		t2.start();
	}
}
class Processor9 implements Runnable{
	Account act;
	Processor9(Account act){
		this.act=act;
		}
	public void run() {
		act.withdraw(1000);
		System.out.println("取款1000.0成功,余额:"+act.getBalance());
	}
}
//账户类
class Account {
	private String actno;// 账号
	private double balance;// 余额

	public Account(String actno, double balance) {
		this.actno = actno;
		this.balance = balance;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	//取款
	public void withdraw(double money) {
		//把需要同步的代码，放到同步的语句块中
		synchronized(this) {
		double after=balance-money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		this.setBalance(after);
	}
	}

}