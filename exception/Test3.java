package exception;
//在finally前退出虚拟机 finally就不会再执行了
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test3 {
	public static void main(String []args) {
		try {
			FileInputStream fis=new FileInputStream("d:/xiao.txt");
			System.out.println("不会执行");	
			System.exit(0);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("会执行");
		}
		
	}
}
