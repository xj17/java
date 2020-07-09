package IO;

import java.io.*;

public class BufferedReaderTest02 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("F:\\eclipse-workspace\\Test\\src\\IO\\BufferedReaderTest02.java");
		InputStreamReader isr=new InputStreamReader(fis);//字节流转换成字符流
		BufferedReader br=new BufferedReader(isr);
		//BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("F:\\eclipse-workspace\\Test\\src\\IO\\BufferedReaderTest02.java")));
		String temp=null;
		while((temp=br.readLine())!=null) {
			System.out.println(temp);
			
		}
		br.close();
	}

}
