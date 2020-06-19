package exception;

public class Test {
	public static void main(String[]args) {
		String username="xiao";
		CustomerService cs=new CustomerService();
		try {
			cs.register(username);
		}catch(IllegalNameException e){
			System.out.println(e.getMessage());
		}
		
	}
}
