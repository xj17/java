package col;
//Map集合的常用方法
import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		Map persons=new HashMap();
		//存储键值对
		persons.put("10000","JACK");//key无序不可重复--HashSet
		persons.put("10011","JACK");
		persons.put("10002","SUN");
		persons.put("10003","COOK");
		persons.put("10004","KING");
		persons.put("10000","LUCY");
		System.out.println(persons.size());//判断键值对个数 5
		//判断是否包含这样的key
		System.out.println(persons.containsKey("10000"));
		System.out.println(persons.containsValue("LUCY"));//key如果重复，valus采用的 是覆盖
		
		//System.out.println(persons.get("10011"));//JACK
		persons.remove("10002");//通过key删除键值对    ---SUN
		
		//获取所有的value
		Collection values=persons.values();
		Iterator it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		//获取所有的key
		Set keys=persons.keySet();
		Iterator it1=keys.iterator();
		while(it1.hasNext()) {
			Object id=it1.next();
			Object name=persons.get(id);
			System.out.println(id+"---->"+name);
			
		}
		/*把Map转换成Set集合
		Set entrySet=persons.entrySet();
		Iterator it2=entrySet.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		*/
	}
	

}
