package Number;

import java.math.BigDecimal;//精确度极高，适合做财务软件

public class NumberTest02 {
	public static void main(String[] args) {
		BigDecimal v1 = new BigDecimal(1);
		BigDecimal v2 = new BigDecimal(2);
		BigDecimal v3 = v1.add(v2);
		System.out.println(v3);
	}
}
