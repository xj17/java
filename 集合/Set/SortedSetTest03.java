package col;

import java.util.*;

public class SortedSetTest03 {

	public static void main(String[] args) {
		SortedSet products = new TreeSet(new ProductComparator());
		Product p1 = new Product(3.4);
		Product p2 = new Product(4.0);
		Product p3 = new Product(3.0);
		Product p4 = new Product(2.0);
		Product p5 = new Product(5.0);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		Iterator it=products.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
	}

}

class Product {
	double price;

	Product(double price) {
		this.price = price;
	}

	public String toString() {
		return price + "";
	}
}

class ProductComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		double price1 = ((Product) o1).price;
		double price2 = ((Product) o2).price;
		if (price1 == price2) {
			return 0;
		} else if (price1 > price2) {
			return 1;
		} else {
			return -1;
		}
	}
}
