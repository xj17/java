package IO;
//缺点：频繁访问磁盘，伤害磁盘，并且效率低。
import java.io.*;

public class FileInputStreamTest01 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("temp.txt");
/*
		while (true) {
			int temp = fis.read();
			if (temp == -1)
				break;
			System.out.print(temp + "  ");
		}
*/
		int temp=0;
		while((temp=fis.read())!=-1) {
			System.out.print(temp + "  "); //97  98  99  100  101  102  
		}
		fis.close();
	}
}