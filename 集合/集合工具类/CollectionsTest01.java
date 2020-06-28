package col;

//集合工具类Collections可以对List集合中的元素排序，但是集合中的元素必须是可比较的，实现comparable接口
import java.util.*;

public class CollectionsTest01 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(20);
		l.add(30);
		/*
		 * for(Iterator it=l.iterator();it.hasNext();) { System.out.println(it.next());
		 * }
		 */
		Collections.sort(l);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		/*把ArrayList转换成线程安全的
		List mylist=new ArrayList();
		Collections.synchronizedList(mylist);
		*/
	}
}
