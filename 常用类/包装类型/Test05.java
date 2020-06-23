package a2;

public class Test05 {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		int i2=i1.intValue();
		Integer i3=10;	//自动装箱
		int i4=i3; //自动拆箱
		System.out.println(i3); //"10"
		System.out.println(i4+1); //11
	}

}
