package generic;
import java.util.*;
/*for(类型 变量:数组/集合){  }
 * 增强for  集合需要使用泛型
 * 增强for缺点 没有下标
 */
public class ForeachTest01 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, 7, 10 };
		for (int e : a) {
			System.out.print(e + "  ");
		}
		System.out.println();
		Set<String>strs=new HashSet<String>();
		strs.add("张三");
		strs.add("李四");
		strs.add("王五");
		strs.add("赵六");
		for(String name:strs) {
			System.out.print(name+"    ");
		}
		System.out.println();
	}

}
