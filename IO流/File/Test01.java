package IOtest;

import java.io.File;

public class Test01 {

	public static void main(String[] args)throws Exception {
		File f1=new File("F:\\eclipse-workspace\\Test\\src\\IOtest\\Test01.java");
		System.out.println(f1.exists());//true
		File f2=new File("C:/sers/lenovo/Desktop/TT");
		System.out.println(f2.exists());//false
		if(!f2.exists()) {
			f2.mkdir();//创建目录
		}
		File f3=new File("C:/Users/lenovo/Desktop/TT");
		if(!f3.exists()) {
			f3.createNewFile();//创建文件
		}
		File f4=new File("C:/Users/lenovo/Desktop/a/b/c");
		if(!f4.exists()) {
			f4.mkdirs();//创建多重目录
		}
	}

}
