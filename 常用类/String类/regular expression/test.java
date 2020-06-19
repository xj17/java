package String;

public class test {
	public static void main(String[]args) {
		String s="dd国666dd国666";
		System.out.println(s.replaceAll("dd", "中"));//把dd替换成中
		System.out.println(s.replaceAll("d{2}","中"));
		
		System.out.println(s.replaceAll("\\d","中"));//数字替换成中
		System.out.println(s.replaceAll("\\D","中")); 
	}

}
