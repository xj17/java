package IO;
import java.io.*;
public class BufferedWriterTest01 {

	public static void main(String[] args) throws Exception{
		BufferedWriter bw=new BufferedWriter(new FileWriter("temp04"));
		bw.write("大威天龙，世尊地藏，般若诸佛，般若巴嘛空");;
		bw.newLine();//写入一个行作为分隔符
		bw.write("哼！雕虫小技，竟敢班门弄斧，大威天龙!");
		bw.flush();//刷新
		bw.close();
	}

}
