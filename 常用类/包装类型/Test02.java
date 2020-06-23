package a2;
//以Integer为例
public class Test02 {
	public static void main(String[]args) {
		System.out.println("int的最大值"+Integer.MAX_VALUE);
		System.out.println("byte的最大值"+Byte.MAX_VALUE);	
		
		Integer i1=new Integer(10);
		Integer i2=new Integer("123");
		System.out.println(i1);// int--→Integer
		System.out.println(i2);// String--→Integer 可将字符串转还成Integer类型，但字符串必须是数字
		
		
	}
}
