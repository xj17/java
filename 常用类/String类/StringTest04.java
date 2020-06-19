package String;

/*charAt返回指定索引出的char值
 * boolean endWith(String str);
 * byte[]getBytes();
 * int index Of(Sting str) 返回指定字符串第一次出现的索引
 * replaceAll
 * toUpperCase toLowerCase
 * trim 去除前后空白
 * 
 */
public class StringTest04 {
	public static void main(String[] args) {
		Object o = null;
		System.out.println(o);
		System.out.println(String.valueOf(o)); // 对空值进行了处理
		// System.out.println(o.toString()); 出现空指针异常
	}
}
