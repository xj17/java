package array1;

public class ArrayTest05 {
	public static void main(String[]args) {
		//创建一个数组，既能存储猫，也能存储狗
		Animal[]as=new Animal[4];
		//赋值
		//Dog d1=new Dog();
		Dog d2=new Dog();
		Cat c1=new Cat();
		//Cat c2=new Cat();
		as[0]=c1;
		//as[1]=c2;
		//as[2]=d1;
		as[3]=d2;
		for(int i=0;i<as.length;i++) {
		Animal a=as[i];
	//	System.out.println(a);
		if(a instanceof Cat) {
		 Cat c=(Cat)a;
		 c.move();
		}else if(a instanceof Dog) {
			Dog d=(Dog)a;
			d.eat();
			}
		}
	}

}

class Animal{
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat");
	}
}
class Cat extends Animal{
	public void move() {
		System.out.println("Cat move");
	}
}