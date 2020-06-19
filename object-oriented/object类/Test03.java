package p6;
//比较字符串是否一致
public class Test03 {
	public static void main(String[]args) {
		String s1=new String("ABC");  //引用数据类型
		String s2=new String("ABC");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); //String已经重写了Object中的equals方法，比较的是内容
		
	}
	
}
