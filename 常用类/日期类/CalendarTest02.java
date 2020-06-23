package date;
//2008,8,8 是周几
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest02 {
	public static void main(String[] args) throws Exception {
		Calendar c = Calendar.getInstance();

		String strTime = "2008,08,08";
		Date d = new SimpleDateFormat("yyyy,MM,dd").parse(strTime);
		c.setTime(d);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
}
