package thread;

import java.text.*;
import java.util.*;

public class TimeTest1 {

	public static void main(String[] args) throws Exception {
		Timer t = new Timer();
		t.schedule(new TimerTask() {

			public void run() {
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));

			}
		}, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2020-07-27 10:28:00 000"), 3 * 1000);

	}

}
