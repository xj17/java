package Number;

//定义一个方法，计算两个int类型数据的商 计算成功返回1，失败返回0
public class enumTest01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		Result retValue = divide(a, b);
		if (retValue == Result.SUCCESS) {
			System.out.println("成功");
		} else if (retValue == Result.FAIL) {
			System.out.println("失败");
		}
	}

	public static Result divide(int a, int b) {
		try {
			int c = a / b;
			return Result.SUCCESS;
		} catch (Exception e) {
			return Result.FAIL;
		}
	}

	enum Result {
		SUCCESS, FAIL;
	}

	enum Season {
		SPRING, SUMMER, AUTUMN, WINTER;
	}

}
