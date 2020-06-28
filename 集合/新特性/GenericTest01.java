package generic;

import java.util.*;

public class GenericTest01 {
	public static void main(String[] args) {
		List<String> strs = new ArrayList<>();
		strs.add("JACK");
		strs.add("SUN");
		strs.add("KING");
		strs.add("SMITH");
		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
