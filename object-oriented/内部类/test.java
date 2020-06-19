package p7;
局部内部类
public class test {
	public void m1() {
		final int i=10;
		class InnerClass {
			public void m2() {
				System.out.println(i);
			}
		}
		InnerClass inner=new InnerClass();
		inner.m2();
	}
	public static void main(String[]args) {
		test t=new test();
		t.m1();
	}
	
}
