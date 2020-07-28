package p2;

import java.io.FileReader;
import java.util.*;

//反射机制+IO+properties联合应用
public class Test02 {

	public static void main(String[] args) throws Exception  {
		Properties p=new Properties();
		FileReader fr=new FileReader("classInfo.properties");
		p.load(fr);
		fr.close();
		String className=p.getProperty("className");
		System.out.println(className);
		//通过反射机制创建对象
		Class c=Class.forName(className);
		Object o=c.newInstance();
		System.out.println(o);
	
	}

}

