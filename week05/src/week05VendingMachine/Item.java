package week05VendingMachine;

public class Item {

	

	String desc;
	
	Item(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Item [desc=" + desc + "]";
	}
}
