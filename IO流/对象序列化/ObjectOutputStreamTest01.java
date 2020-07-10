package IO;

//内存-->硬盘文件 B(浏览器)-->S(服务器)
//Compile 编译 (java-->class) Decompile 反编译 (class-->java)
//java.io.ObjectOutputStream; 序列化JAVA对象到硬盘Serial
//java.io.ObjectInputStream; 将硬盘中得数据反序列化到Jvm内存 DeSerial
import java.io.*;

public class ObjectOutputStreamTest01 {

	public static void main(String[] args) throws Exception {
		User u1=new User("刘德华");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("temp06"));
		oos.writeObject(u1);
		oos.flush();
		oos.close();
	}

}
