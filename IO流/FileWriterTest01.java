package IO;
import java.io.FileWriter;//文件字符输出流
public class FileWriterTest01 {

	public static void main(String[] args)throws Exception {
		FileWriter fw=new FileWriter("temp03",true);
		fw.write("HelloWorld!");
		char[]chars= {'1','2','3','4','5','6','7','8'};
		fw.write(chars,0,5);;
		fw.flush();
		fw.close();
		
		//HelloWorld!12345
	}

}
