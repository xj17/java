package date;
//获取特定的日期
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest02 {
	public static void main(String[]args) throws Exception{
		String strTime="2020年6月23日 10:32:00 666";
		//String-->Date
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		Date d=sdf.parse(strTime);
		System.out.println(strTime);
		
	}
}
