package exception;
//顾客相关的业务
public class CustomerService {
	public void register(String name) throws IllegalNameException  {  //注册
		//完成注册
		if(name.length()<6) {
			throw new IllegalNameException("用户名长度不能小于6位");
		}
		System.out.println("注册成功！");
	}
}
