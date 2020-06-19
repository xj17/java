package p6;

public class Test01 {
	public static void main(String[] args) {
		Object o1 = new Object();
		String o2 = o1.toString(); // 调用toString方法
		System.out.println(o2);
		Person p1 = new Person("liu", 50);
		String pstr = p1.toString();
		System.out.println(pstr);
	}

}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 重写toString方法
	public String toString() {
		return "Person[name=" + name + ",age=" + age + "]";
	}

}