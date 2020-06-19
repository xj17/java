package exception;
//用throws处理异常不是真正的处理异常而是抛卸责任
/*
 * try{可能出现的异常
 }
 catch(异常类型1   变量){
 处理异常的代码
 }
 catch(异常类型2   变量){
 处理异常的代码
 }
 1.catch语句块可以写多个
 2.catch捕捉要从上到下  从小到大
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	public static void main(String []args){
		try {
			FileInputStream fis=new FileInputStream("d:/xiao1.txt");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			String msg=e.getMessage();
			System.out.println(msg);
		}
		
}
}
