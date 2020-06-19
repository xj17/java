package p5;
//汽车和发动机的接口
//成产汽车的厂家面向接口生产
//生产发动机的厂家面向接口生产
public class Test {
	public static void main(String []args) {
		Engine e1=new Yamha();  //生产引擎
		Car c=new Car(e1);   //生产汽车
		c.testEngine(); //测试引擎
		c.e=new Hoda();//***
		c.testEngine(); 
	}
}
