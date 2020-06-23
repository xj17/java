package date;

import java.text.SimpleDateFormat;
import java.util.Date;  //重写了Object中的toString方法

//获取系统当前时间
public class DateTest01 {
	public static void main(String[]args) {
		Date nowtime=new Date();
		System.out.println(nowtime);//Tue Jun 23 10:18:45 CST 2020
	
		//日期格式化对象
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss SSS");
	//开始格式化 Date-->String
		String strTime=sdf.format(nowtime);
		System.out.println(strTime);//2020年06月23日  10:25:49 690
		
	}
}
