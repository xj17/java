package generic;

import java.util.*;

public class DiyGenericTest01 {
	public static void main(String[] args) {
		Myclass<String> mc = new Myclass<>();
		mc.m1("JACK");
	}
}

class Myclass<T> {
	public void m1(T t) {
		System.out.println(t);
	}

}
