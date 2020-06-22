package a1;

public class Test01 {

	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		String[] ins = { "体育", "睡觉", "音乐", "美食" };
		for (int i = 0; i < ins.length; i++) {
			if (i == ins.length - 1) {
				sb.append(ins[i]);

			} else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		System.out.println(sb);
	}
}
