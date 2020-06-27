package List_test;
import java.util.*;
public class ListTest01 {

	public static void main(String[] args) {
		//创建一个List集合
		List l=new ArrayList();
		l.add(100);
		l.add(99);
		l.add(99);
		l.add(66);
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//100 99 99 66
		}
		
		

	}

}
