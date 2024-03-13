package week05VendingMachine;

public class Return {

	Item Item;
	double change;

	public Return() {

	}

	Return(Item item, double change) {
		this.Item = item;
		this.change = change;

	}

	public Item getItem() {
		return Item;
	}

	public void setItem(Item item) {
		Item = item;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public void ChangeLeft() {
		System.out.println("Item: " + Item.getDesc());
		System.out.println("Change: " + change);
	}

}
