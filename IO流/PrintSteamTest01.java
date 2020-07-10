package IO;

import java.io.FileOutputStream;
import java.io.PrintStream; //标准输出流,默认打印到控制台,以字节方式.
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 
 */
public class PrintSteamTest01 {

	public static void main(String[] args) throws Exception{
		System.out.println("HelloWorld");//默认输出到控制台
		PrintStream ps=System.out;
		ps.println("JAVA.....");//改变输出方向
		System.setOut(new PrintStream(new FileOutputStream("log")));//记录日志
		//System.out.print("HAHA");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println("m1方法开始执行"+sdf.format(new Date()));
		m1();
		System.out.println("m1方法开始结束"+sdf.format(new Date()));
		
	}
	public static void m1() {
		System.out.println("m1 method execute");
	}

}
