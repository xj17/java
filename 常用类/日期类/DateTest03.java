package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
	public static void main(String[]args) {
		Date t1=new Date(1000);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		System.out.println(sdf.format(t1));
		
		//获得当前系统前十分钟时间
		Date t2=new Date(System.currentTimeMillis()-10*60*1000);   //currentTimeMillis 系统当前时间的毫秒数
		System.out.println(t2);
		
	}
}
