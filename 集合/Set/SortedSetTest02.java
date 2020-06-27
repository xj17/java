package col;

/*
 *SortedSet集合存储元素为什么可自动排序
 *实现了Comparable接口
 *
 */
import java.util.*;

public class SortedSetTest02 {

	public static void main(String[] args) {
		SortedSet users = new TreeSet();
		User u1 = new User(11);
		User u2 = new User(22);
		User u3 = new User(14);
		User u4 = new User(23);
		User u5 = new User(13);
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		Iterator it=users.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}

	}

}
class User implements Comparable{
	int age;
	User(int age){
		this.age=age;
	}
	public String toString() {
		return "User[age="+age+"]";
	}
	public int compareTo(Object o) {
		int age1=this.age;
		int age2=((User)o).age;
		return age1-age2;
	}
}
