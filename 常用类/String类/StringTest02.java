package String;

public class StringTest02 {
	public static void main(String[] args) {
		String[] ins = { "sport", "music", "food", "sleep" };
		// 将兴趣爱好拼接成一个字符串
		String tem = "";
		for (int i = 0; i < ins.length; i++) {
			if(i==ins.length-1) {
				tem=tem+ins[i];
			}else
			tem=tem+ins[i]+",";
		}
		System.out.println(tem);
	}
}