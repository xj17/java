package IO;
import java.io.Serializable;  //该接口没有任何方法,是一个标识接口,类似的还有java.lang.Clone
/*
 *   标识的作用
 *   Jvm如果看到对象实现了某个标识接口，会对他特殊待遇。
 */
public class User implements Serializable{
	String name;
	User(String name){
		this.name=name;
	}
	public String toString() {
		return "User[name="+name+"]";
	}
}
