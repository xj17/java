package List_test;
import java.util.*;
/*
 *ArrayList集合底层是数组，有下标，它有很多自己的特性
 *初始化容量是10,扩大后是原容量的1.5倍
 *尽量减少扩容操作,扩容需要数组拷贝,数组拷贝很耗内存
 *在创建集合的时候指定初始化容量
 */
public class ListTest02 {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(2,66);
		//System.out.println(l.get(0));
		for(int i=0;i<l.size();i++) {
			Object obj=l.get(i);
			System.out.println(obj);//11 22 66 33
		}
		
		
	}

}
