package a2;
//三种类型转换 String Integer int 
public class Test04 {
	public static void main(String[]args) {
		Integer i1=Integer.valueOf(10);//int-->Integers
		int i2=i1.intValue(); //Integer-->int
		
		Integer i3=Integer.valueOf("10"); //String-->Integer
		String s=i3.toString();  //Integer-->String
		
		int i4=Integer.parseInt("123"); //String-->int
		
		String s2=10+"";//int-->String
	}
}
