package p5;

public class Car {
	Engine e;   //属性
	Car(Engine e){
		this.e=e;
	}
	public void testEngine() {
		e.start();
	}
}
