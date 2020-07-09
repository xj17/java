package IO;

import java.io.*;

public class BufferedReaderTest01 {

	public static void main(String[] args) throws Exception {
		// 创建一个带有缓冲区的字符输入流
		/*
		 * FileReader fr=new FileReader("BufferedReaderTest01.java");//创建一个文件字符输入流 --节点流
		 * BufferedReader br=new BufferedReader(fr);//将文件字符输入流包装成带有缓冲区的字符输入流 --包装流
		 * 
		 * //根据流出现的位置 分为：包装流/处理流和节点流
		 */
		BufferedReader br = new BufferedReader(new FileReader("F:\\eclipse-workspace\\Test\\src\\IO\\BufferedReaderTest01.java"));
		// 只需要关闭最外层的包装流(装饰者模式)
		String temp = null;
		while ((temp = br.readLine()) != null) {
			System.out.println(temp);
		}
		br.close();
	}

}
