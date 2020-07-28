package p1;
//获取Class的三种方式.
public class ReflectTest01 {

	public static void main(String[] args) throws ClassNotFoundException {
		//c1引用保存内存地址指向堆中的对象,该对象代表的是Employee整个类
		Class c1=Class.forName("Employee");
		//java每个类型都有class属性
		Class c2=Employee.class;
		//任何一个对象都有getClass方法
		Employee e=new Employee();
		Class c3=e.getClass();
		
		//Class c4=Date.class;
		//Class c5=class.forName("java.unti.Date");
		//Date d=new Date(); Class c6=d.getClass();
		
		Class c7=int.class; //c7就代表基本数据类型

	}

}
