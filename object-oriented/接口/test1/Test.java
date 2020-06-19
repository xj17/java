package p4;

public class Test {
	public static void main(String[]args) {
		CustomerService cs=new CustomerServiceImpl();
		//面向接口去调用，底层是CustomerServiceImpl对象
		cs.logout();
	}
}
