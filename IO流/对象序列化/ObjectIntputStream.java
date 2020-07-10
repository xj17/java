package IO;
import java.io.*;
public class ObjectIntputStream {

	public static void main(String[] args)throws Exception {
		ObjectInputStream ols=new ObjectInputStream(new FileInputStream("temp06"));
		Object o=ols.readObject();
		System.out.println(o);//User[name=刘德华]
		ols.close();
	}

}
