package IO;

import java.io.File;

public class Test03 {
	public static void main(String []args) {
		File f=new File("F:\\eclipse-workspace\\Test");
		method(f);
	}
	public static void method(File f) {
		if(f.isFile()) {
			return;
		}
		//File是目录的话
		File[]fs=f.listFiles();
		for(File subF:fs) {
			System.out.println(subF.getAbsolutePath());
			method(subF);
		}
	}
}
