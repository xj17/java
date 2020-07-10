package IOtest;
//使用BufferedReader对FileReader中的close方法进行扩展
//装饰者模式要求：1.装饰者中含有被装饰者的引用2.实现同一个类型
public class BufferedReader extends Reader{  //BufferedReader --装饰者
	FileReader reader;   //FileReader--被装饰者
	BufferedReader(FileReader reader){
		this.reader=reader;
	}
	public void close() {
		 System.out.println("扩展代码1");
		 reader.close();
		 System.out.println("扩展代码2");
	}
}
