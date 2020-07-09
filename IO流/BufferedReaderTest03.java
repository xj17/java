package IO;
//接收用户键盘输入
import java.io.*;

public class BufferedReaderTest03 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("您输入了 ：" + str);
		br.close();
	}

}
