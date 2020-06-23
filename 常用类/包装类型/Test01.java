package a2;

public class Test01 {
	public static void m1(Object o) {
		System.out.println(o);
	}
	public static void main(String[] args) {
		//基本数据类型
		byte b=10;
		//引用类型
		Byte b1=new Byte(b);
		m1(b1);
		
	}

}
