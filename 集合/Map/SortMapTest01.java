package col;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * SortMap中key的特点,无序不可重复，但是存进去的可以按大小自动排列
 * 想自动排序，key的部分：1.实现comparable接口2.单独写一个比较器Comparator
 */
public class SortMapTest01 {

	public static void main(String[] args) {
		// Map,key存储Product,value存储个数
		SortedMap products=new TreeMap();
		Product p1=new Product("西瓜",1.0);
		Product p2=new Product("苹果",4.0);
		Product p3=new Product("桃子",5.0);
		Product p4=new Product("香蕉",3.0);
		products.put(p1, 8.0);
		products.put(p2, 3.0);
		products.put(p3, 4.0);
		products.put(p4, 10.0);
		Set keys=products.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object k=it.next();
			Object v=products.get(k);
			System.out.println(k+"----->"+v+"kg");
		}

	}

}

class Product implements Comparable{
	String name;
	double price;

	Product(String name, double price) {
		this.name=name;
		this.price=price;
	}
	public String toString(){
		return "Product[name="+name+",price="+price+"]";
	}
	public int compareTo(Object o) {
		double price1=this.price;
		double price2=((Product)o).price;
		if(price1<price2) {
			return -1;
		}else if(price1>price2){
			return 1;
		}
		return 0;
	}
}
