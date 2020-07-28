package p2;
//IO+properties联合应用
/*
 * deinfo--配置文件--使程序更加灵活--属性文件-通常以.priperties结束
 * 
 */
import java.util.*;
import java.io.*;

public class Test01 {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("dbinfo");
		//将fis流中的所有数据加载到属性对象中
		p.load(fis);
		fis.close();
		String v=p.getProperty("username");
		System.out.println(v);
		String v1=p.getProperty("password");
		System.out.println(v1);
	}

}
