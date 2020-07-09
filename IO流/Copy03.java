package IO;
import java.io.*;
//使用BufferedReader和BufferedWriter完成复制
public class Copy03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("F:\\eclipse-workspace\\Test\\src\\IO\\Copy03.java"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\copy03.java"));
		String temp=null;
		while((temp=br.readLine())!=null) {
			bw.write(temp);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
