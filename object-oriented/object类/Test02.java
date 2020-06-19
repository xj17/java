package p6;

public class Test02 {
	public static void main(String[]args) {

		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.equals(o2)); //==两边如果是引用类型，则比较内存地址
		Star s1=new Star(0, null);
		Star s2=new Star(0, null);
		System.out.println(s1.equals(s2)); 
		
	}
}
class Star {
	int id;
	String name;
	public Star(int id,String name) {
		this.id=id;
		this.name=name;
	}
	//重写object方法
	public boolean equals(Object obj) {
		if(obj instanceof Star) {
		Star s=(Star)obj;
		if(s.id==id &&true) {
			return true;
		}
	}
		return false;
}
}
