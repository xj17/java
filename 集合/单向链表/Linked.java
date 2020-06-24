package c1;

public class Linked {
	Entry entry;

	Linked() {
		entry = new Entry(null, null);
	}
	//add
	//remove
	//find
	class Entry {
		Object data;
		Entry next;

		Entry(Object date, Entry next) {
			this.data = date;
			this.next = next;
		}
	}
}
