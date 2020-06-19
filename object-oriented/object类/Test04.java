package p6;

public class Test04 {
	public static void main(String[]args) {
		Person1 p1=new Person1();
		p1=null;
		System.gc();
	}
}
class Person1 {
	public void finalize()throws Throwable{
		System.out.println(this+"马上就要被回收了!");
		//Person1 p=this;   //引用重新指向该对象
	}
}
