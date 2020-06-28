package col;

import java.util.Properties;  //也是由key,value组成，但是key,value都是字符串类型。

public class PropertiesTest {
	public static void main(String[] args) {
		//1.创建属性类对象
		Properties p=new Properties();
		//2.存
		p.setProperty("driver","oracle.jdbc.driver.OracleDriver");
		p.setProperty("username", "scoot");
		p.setProperty("passwd", "tiger");
		p.setProperty("url", "jdbc.oracle:thin:@192.168.1.100:1521:bjpowernode");
		//3.取
		String v1=p.getProperty("driver");
		String v2=p.getProperty("username");
		String v3=p.getProperty("passwd");
		String v4=p.getProperty("url");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
