package col;

import java.util.*;

public class SetTest01 {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(1);
		s.add(1);
		s.add(100);
		s.add(85);
		s.add(98);
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);

		}

	}

}
