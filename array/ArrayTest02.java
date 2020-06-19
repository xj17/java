package array1;
//数组的拷贝
public class ArrayTest02 {
	public static void main(String[]args) {
	int[]src= {2,3,4,5,6,7,8};
	int[]desc= {10,11,12,13,14,15,16};
	System.arraycopy(src,2,desc,3,3);
	for(int i=0;i<desc.length;i++) {
		System.out.println(desc[i]);
	}
	}
}
