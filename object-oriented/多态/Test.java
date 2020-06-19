package p2;
/*父类型引用指向子类对象
 使用多态 项目耦合度降低，扩张能力增强
*/
public class Test {

	public static void main(String[]args) {
	//创建主人
		Person p = new Person();
	//创建宠物
		Animal a=new Dog();
		p.fed(a);;
		
	}
}
