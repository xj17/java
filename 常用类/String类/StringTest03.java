package String;

public class StringTest03 {
	public static void main(String[] args) {
		byte[] byt = { 97, 98, 99, 100 };  //字节
		String s=new String(byt);  //abcd
		System.out.println(s);
		String s1=new String(byt,0,2);  //ab
		System.out.println(s1);
	}

}
