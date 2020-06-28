package generic;
import java.util.*;
public class GenericTest02 {

	public static void main(String[] args) {
		Map<String,Integer>maps=new HashMap<>();
		maps.put("西瓜",10);
		maps.put("苹果",9);
		maps.put("香蕉",20);
		Set<String>keys=maps.keySet();
		Iterator<String>it=keys.iterator();
		while(it.hasNext()) {
			String k=it.next();
			Integer v=maps.get(k);
			System.out.println(k+"-->"+v);
		}
		
	}

}
