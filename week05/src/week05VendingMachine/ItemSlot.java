package week05VendingMachine;

public class ItemSlot {

	Item item;
	double price;
	int qty;

	ItemSlot(Item item, double price, int qty) {
		this.item = item;
		this.price = price;
		this.qty = qty;

	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "" + item.toString() + ", price=" + price + ", qty=" + qty + "]";
	}
}
