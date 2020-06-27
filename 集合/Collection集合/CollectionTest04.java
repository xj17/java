package col_test;
import java.util.*;
//remove和contains方法都需要集合中的元素重写equals方法
//迭代器的remove方法
public class CollectionTest04 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		System.out.println(c.size());//3
		Iterator it=c.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(c.size());//0
	}
}
