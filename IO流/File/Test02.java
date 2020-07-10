package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//1.获取绝对路径
		File f1=new File("F:\\eclipse-workspace\\Test\\src\\IO\\Test02.java");
		String absolutePath=f1.getAbsolutePath();
		System.out.println(absolutePath);
		//2.获取文件名
		System.out.println(f1.getName());
		//3.获取父路径
		System.out.println(f1.getParent());
		//4.判断该File是Directory还是File
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		//5.获取文件最后一次修改时间
		Date t=new Date(f1.lastModified());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		//6.获取文件的长度(字节数)
		System.out.println(f1.length());
		//7.列出子目录
		File f3=new File("F:\\eclipse-workspace\\Test\\src\\IO");
		File[]fs=f3.listFiles();
		for(File f:fs) {
			//System.out.println(f.getAbsolutePath());
			if(f.getAbsolutePath().endsWith(".java")) {  //输出以.java结尾的文件
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
