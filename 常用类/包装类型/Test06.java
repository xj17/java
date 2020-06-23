package a2;

public class Test06 {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i1.equals(i2));
		//true 比较两个Integer类型的数据是否相等，Integer已经重写了Object中的equals方法
	//数据在(-128~127)，java引入了一个整型常量池
		Integer i3=126;//不会在堆中创建对象，直接从常量池中拿
		Integer i4=126;
		System.out.println(i3==i4);//true
	}

}
