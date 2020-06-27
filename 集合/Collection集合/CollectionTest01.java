package col_test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
	public static void main(String[] args) {
		// 1.创建集合
		Collection c = new ArrayList();
		// 2.添加元素
		c.add(1);
		c.add(new Integer(100));
		Object o = new Object();
		c.add(o);
		Customer cus = new Customer("XIAO", 20);
		c.add(cus);
		// 3.获取元素的个数
		System.out.println(c.size()); //4
		// 4.将集合转换成Object类型的数组
		Object[]objs=c.toArray();
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);  //1 100  java.lang.Object@7852e922  Customer[name=XIAO,age=20]
		}
		// 5.清空
		c.clear();
		System.out.println(c.isEmpty()); //true
	}
}

class Customer {
	String name;
	int age;

	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 重写Object的toString
	public String toString() {
		return "Customer[name=" + name + ",age=" + age + "]";
	}
}
