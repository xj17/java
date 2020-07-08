package IO;

import java.io.*;

public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//创建文件字节输出流
			fos = new FileOutputStream("temp02");//文件不存在,就自动创建,会创建到项目的
			//fos = new FileOutputStream("temp02",true); //以追加的方式写入
			String msg = "HelloWorld!";
			byte[] bytes = msg.getBytes();//String-->byte数组
			fos.write(bytes);
			//fos.write(bytes,0,3);   //Hel
			fos.flush();//强制写入  刷新
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
