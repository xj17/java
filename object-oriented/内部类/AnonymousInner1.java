package p7;

//匿名内部类 使用匿名内部类执行t方法
public class AnonymousInner1 {
	// 成员方法
	public static void t(CustomerService cs) {
		cs.logout();
	}

	public static void main(String[] args) {
		// 调用t方法
		t(new CustomerService() {
			public void logout() {
				System.out.println("系统安全退出！");
			}
		});

	}
}

interface CustomerService {
	void logout();
}
