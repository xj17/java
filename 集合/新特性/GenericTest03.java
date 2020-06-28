package generic;

import java.util.*;

public class GenericTest03 {

	public static void main(String[] args) {
		SortedSet<Manager> ss = new TreeSet<>();
		Manager m1 = new Manager(1000.0);
		Manager m2 = new Manager(1500.0);
		Manager m3 = new Manager(1300.0);
		ss.add(m1);
		ss.add(m2);
		ss.add(m3);
		Iterator <Manager>it = ss.iterator();
		while (it.hasNext()) {
			Manager m=it.next();
			m.work();
		}

	}

}

class Manager implements Comparable<Manager> {
	double sal;

	Manager(double sal) {
		this.sal = sal;
	}

	public String toString() {
		return sal + "";
	}

	public void work() {
		System.out.println("在工作，一个月" + sal + "元");
	}

	public int compareTo(Manager m) {
		double sal1 = this.sal;
		double sal2 = m.sal;
		if (sal1 > sal2) {
			return 1;
		} else if (sal1 < sal2) {
			return -1;
		}
		return 0;
	}
}
