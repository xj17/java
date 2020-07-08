package IO;

import java.io.*;

public class FileInputStreamTest04 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("temp.txt");
		System.out.println(fis.available());//7 
		System.out.println(fis.read());//97
		System.out.println(fis.available());//6
		//跳过两个字节
		fis.skip(2);
		System.out.println(fis.read());//100
	}

}
