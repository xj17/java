package hotel;

class Room {
	private String no;// 房间编号
	private String type;// 房间类型
	private boolean isuse;// 是否占用
	public Room(String no, String type, boolean isuse) {
		super();
		this.no = no;
		this.type = type;
		this.isuse = isuse;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isIsuse() {
		return isuse;
	}
	public void setIsuse(boolean isuse) {
		this.isuse = isuse;
	}
	public String toString(){
		return "["+no+","+type+","+(isuse?"占用":"空闲")+"]";
	}
	

}
