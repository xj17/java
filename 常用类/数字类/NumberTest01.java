package Number;

//数字格式化
import java.text.DecimalFormat;

public class NumberTest01 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(1234567));//1,234,567
		// 需求 加入千分位 保留两位小数
		DecimalFormat df1 = new DecimalFormat("###,###.##");
		System.out.println(df1.format(1234567.123));//1,234,567.12
		// 需求 保留四位小数不够补0
		DecimalFormat df2 = new DecimalFormat("###,###.0000");
		System.out.println(df2.format(1234567.123));//1,234,567.1230
	}
}
