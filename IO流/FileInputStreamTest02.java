package IO;

/*
 int read(byte[]bytes) 读取多个字节存储到byte数组中-->效率高\
 int类型表示这次读取了多少字节，到达文件的末尾返回-1
 */
import java.io.*;

public class FileInputStreamTest02 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("temp.txt");
		byte[] bytes = new byte[3];
		int i1 = fis.read(bytes);
		System.out.println(new String(bytes));//abc
		int i2 = fis.read(bytes);
		System.out.println(new String(bytes));//def
		int i3 = fis.read(bytes);
		System.out.println(new String(bytes));//gef
		System.out.println(new String(bytes,0,i3));//g 
		int i4 = fis.read(bytes);
		System.out.println(i1);// 3
		System.out.println(i2);// 3
		System.out.println(i3);// 1
		System.out.println(i4);// -1

		fis.close();
	}

}
