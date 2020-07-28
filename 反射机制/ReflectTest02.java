package p1;

public class ReflectTest02 {

	public static void main(String[] args) throws Exception {
		//将A.class装载到JVM中的过程
		Class.forName("A");  //A....
		//不会执行静态语句块
	}

}
class A{
	static {
		System.out.println("A....");
	}
	
}
