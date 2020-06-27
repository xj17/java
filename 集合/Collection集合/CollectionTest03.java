package col_test;

import java.util.*;

public class CollectionTest03 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		Integer i1 = new Integer(10);
		c.add(i1);
		System.out.print(c.contains(i1)+" ");// true
		Integer i2 = new Integer(10);
		System.out.print(c.contains(i2)+" ");// true contains底层调用的是equals方法
		
		Manager m1=new Manager(11,"xiao");
		Manager m2=new Manager(11,"xiao");
		c.add(m1);
		System.out.println(c.contains(m2));  //true
	}

}

class Manager {
	int no;
	String name;

	Manager(int age, String name) {
		this.no = no;
		this.name = name;
	}

	// 重写equals方法
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof Manager) {
			Manager m = (Manager) o;
			if (m.no == this.no && m.name.equals(this.name)) {
				return true;
			}
		}
		return false;

	}
}
