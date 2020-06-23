package a2;
/*
 * Integer的常用方法
 */
public class Test03 {
	public static void main(String[]args) {
		Integer i1=new Integer(10);
		int i2=i1.intValue();
		System.out.println(i2+1);   //11
//static int parseInt(String s)  String--→int
		int age=Integer.parseInt("25");
		System.out.println(age+1);
		
	}
}
