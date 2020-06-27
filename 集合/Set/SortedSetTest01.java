package col;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest01 {
	public static void main(String[] args) throws Exception {
		String st1 = "2020-12-12";
		String st2 = "2015-1-5";
		String st3 = "2017-8-8";
		String st4 = "2012-5-12";
		String st5 = "2014-8-15";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date t1 = sdf.parse(st1);
		Date t2 = sdf.parse(st2);
		Date t3 = sdf.parse(st3);
		Date t4 = sdf.parse(st4);
		Date t5 = sdf.parse(st5);

		SortedSet times = new TreeSet();
		times.add(t1);
		times.add(t2);
		times.add(t3);
		times.add(t4);
		times.add(t5);
		Iterator it = times.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof Date) {
				Date d = (Date)element;
				System.out.println(sdf.format(d));
			}
		}
	}
}
