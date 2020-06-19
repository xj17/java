package p7;

//匿名内部类
public class AnonymousInner {
	// 成员方法
	public static void t(CustomerServices cs) {
		cs.logout();
	}

	public static void main(String[] args) {
		// 调用t方法
		t(new CustomerServiceImpl());

	}
}

interface CustomerServices {
	void logout();
}

//编写类实现接口
class CustomerServiceImpl implements CustomerServices {
	public void logout() {
		System.out.println("系统已安全退出!");
	}

}