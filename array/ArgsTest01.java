package array1;

public class ArgsTest01 {
	public static void main(String[]args) {
		
		if(args.length!=2) {
			System.out.println("要想使用该系统，必须这样输入 username password");
			return;
		}
	String username=args[0];
	String passwd=args[1];
	if("admin".equals(username)&&"123".equals(passwd)) {
		System.out.println("登录成功");
	}else {
		System.out.println("登录失败");
	}
	}
	
}
