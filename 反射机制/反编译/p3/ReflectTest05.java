package p3;

import java.lang.reflect.Field;

//获取某个特定的属性
public class ReflectTest05 {

	public static void main(String[] args) throws Exception {
		Class c=User.class;
		Field idF=c.getDeclaredField("id");
		Object o=c.newInstance();
		idF.setAccessible(true);//打破封装
		idF.set(o,"110");
		System.out.println(idF.get(o));
		
	}

}
