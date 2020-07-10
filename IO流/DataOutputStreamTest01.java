package IO;

import java.io.*;

/*
import java.io.DataOutputStream;数据字节输出流
可以将内存中的int i=10;写入到硬盘文件中，写进的是二进制数据，带类型。
*/
public class DataOutputStreamTest01 {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp05"));
		byte b = 10;
		short s = 11;
		int i = 12;
		long l = 1000L;
		float f = 3.2f;
		double d = 2.3;
		boolean flag = false;
		char c = 'a';
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		dos.flush();

	}

}
