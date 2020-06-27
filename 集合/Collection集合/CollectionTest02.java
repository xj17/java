package col_test;

import java.util.*;

/**
Iterator iterator();获取集合所依赖的迭代器对象
通过迭代器中方法完成集合的迭代(遍历)
*所有集合通用的遍历方式*
 */
public class CollectionTest02 {
	public static void main(String[]args) {
		Collection c=new ArrayList();
		c.add(100);//自动装箱
		c.add(3.14);
		c.add(false);
		/*
		Iterator it=c.iterator();  //获取迭代器对象， 面向接口编程，it是引用保存了内存地址
		while(it.hasNext()) {  
			Object o=it.next();
			//System.out.println(o);
		}
		*/
		for(Iterator it=c.iterator();it.hasNext();) {
			Object o1=it.next();
		System.out.println(o1); //100 3.14 false
		}
	}

}
