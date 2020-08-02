package p3;
//获取某个类所有的属性
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest04 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c=User.class;
		/*method1
		Field[]fs=c.getFields();//获取所有public修饰的属性
		System.out.println(fs.length);
		System.out.println(fs[0].getName());
		*/
		/*method2
		Field[]fs=c.getDeclaredFields();
		for(Field field :fs) {
			Class type=field.getType();
			//System.out.println(type.getName());
			int i=field.getModifiers();
			String strModifier=Modifier.toString(i);
			System.out.print(strModifier+" ");
			System.out.print(type.getSimpleName()+" ");
			System.out.print(field.getName()+" ");
			System.out.println();		
		}
		*/
		Field[]fs=c.getDeclaredFields();
		StringBuffer sb=new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		for(Field field:fs) {
			sb.append("\t");
			sb.append(Modifier.toString(field.getModifiers())+" ");
			sb.append(field.getType().getSimpleName()+" ");
			sb.append(field.getName()+";\n");
		}
		sb.append("}");
		System.out.println(sb);	
	}

}
