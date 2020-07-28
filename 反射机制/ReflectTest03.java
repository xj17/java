package p1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReflectTest03 {

	public static void main(String[] args) throws Exception {
		//Class c=Class.forName("Employee");
		Class c1=Employee.class;
		Object o=c1.newInstance();//创建此Class对象所表示的类的一个新实例.调用了Employee无参数构造方法
	//	System.out.println(o); //p1.Employee@7852e922
		
		Class c2=Class.forName("java.util.Date");
		Object o1=c2.newInstance();
		if(o1 instanceof Date) {
			Date t=(Date)o1;
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
			
		}
	}

}

