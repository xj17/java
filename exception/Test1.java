package exception;
/*
 * 1.模拟现实世界中'不正常'的事件
 * 2.采用'类'去模拟异常
 * 3.NullPointerException是一类异常  这个对象就是异常事件
 * 4.程序编译用过，但是运行时出现了异常，表示发生某个异常事件 JVM向控制台输出信息
 * 
 */
public class Test1 {
	public static void mian(String[]args) {
		Test1 t=new Test1();
		t('1');
	}

	private static void t(char c) {
		
		
	}
}
