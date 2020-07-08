package IO;

import java.io.FileReader; //文件字符输入流
import java.io.IOException;

public class FileReaderTest01 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("F:\\eclipse-workspace\\Test\\src\\IO\\FileReaderTest01.java");
			char[]chars=new char[512];
			int temp=0;
			while((temp=fr.read(chars))!=-1) {
				System.out.println(new String(chars,0,temp));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
