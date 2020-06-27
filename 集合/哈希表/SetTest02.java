package col;
//存储在HashSet/HashMap key部分的元素，要同时重写hashcode和equals
import java.util.*;

public class SetTest02 {
	public static void main(String[] args) {
		Set es = new HashSet();
		Employee e1 = new Employee("1000", "JACK");
		Employee e2 = new Employee("1000", "JACK");
		Employee e3 = new Employee("1000", "SCOOT");
		Employee e4 = new Employee("2001", "SUN");
		Employee e5 = new Employee("3000", "JIM");
		Employee e6 = new Employee("3001", "COOK");
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		es.add(e6);

		System.out.println(es.size());
	}
	
}

class Employee {
	String no;
	String name;

	Employee(String no, String name) {
		this.no = no;
		this.name = name;

	}
	public int hashCode() {
		return no.hashCode();
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Employee) {
			Employee e=(Employee)o;
			if(e.no.equals(this.no)&& e.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}

}
