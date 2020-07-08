//关于文件的复制粘贴
package IO;
import java.io.*;
public class Copy01 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("copy");
		FileOutputStream fos=new FileOutputStream("F:/copy");
		byte[]bytes=new byte[1024];
		int temp=0;
		while((temp=fis.read(bytes))!=-1) {
			fos.write(bytes,0,temp);;
		}
		
		fos.flush();
		fis.close();
		fos.close();
	}

}
