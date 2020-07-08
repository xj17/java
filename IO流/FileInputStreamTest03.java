package IO;
//循环读取
import java.io.*;

public class FileInputStreamTest03 {

	public static void main(String[] args) throws Exception {
		 FileInputStream fis=new  FileInputStream("temp.txt"); 
		 byte[]bytes=new byte[1024];
		 while(true) {
			 int temp=fis.read(bytes);
			 if(temp==-1) break;
			 //将bytes数组有效的数据转换成字符串
			 System.out.println(new String(bytes,0,temp));//abcdefg
		 }
		 fis.close();
	}

}
