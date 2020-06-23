package date;

import java.util.Calendar;

public class CalendarTest01 {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();//获取系统当前的日历
		int i=c.get(Calendar.DAY_OF_WEEK);//int i=c.get(7);
		int i1=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);  //3
		System.out.println(i1);  //23
	}

}
