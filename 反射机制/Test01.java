package p1;

import java.util.Date;

//可变长参数
public class Test01 {

	public static void main(String[] args) throws Exception {
		m1();
		m1(1);
		m1(1, 3, 5);
		m2("唱","跳","rap","篮球");
		m3(Date.class,Employee.class);
	}
//如果可以精确匹配的方法,则调用该方法,不会再去执行可变长参数的那个方法.
	public static void m1(int i) {
		System.out.println(i);
	}

	public static void m1(int... a) {
		System.out.println("Test01");
	}
	//可变长参数可以等同看作数组
	public static void m2(String... args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
	
	public static void m3(Class... args) throws Exception {
		for(int i=0;i<args.length;i++) {
			Class c=args[i];
			System.out.println(c.newInstance());
		}
		
	}
	//可变长参数只出现一次,并且出现在最后一位.
	public static void m4(int a,String...args) {
		
	}
	

}
