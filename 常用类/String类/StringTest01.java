package String;

public class StringTest01 {

	public static void main(String[] args) {
		String s1="abc"; //字符串常量创建以后不可变
		//s1="def"; 字符串可以重新指向
		String s2="abc";//从字符串常量池中拿来直接用
		System.out.println(s1==s2);
		String s4=new String("abc");
		String s5=new String("abc");
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
	}
	//比较两个字符串是否相等，要用String提供的equals方法
	
}
