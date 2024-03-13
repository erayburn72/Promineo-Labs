package week05VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

	Map<String, ItemSlot> location;

	public VendingMachine() {
		this.location = new HashMap<>();
	}

	public Map<String, ItemSlot> getLocation() {
		return location;
	}

	public void setLocation(String name, ItemSlot itemSlot) {
		this.location.put(name, itemSlot);
	}

	public Return BuySomething(double money, String loc) {

		ItemSlot itemSlot = location.get(loc);
		Return return1 = new Return();

		if ((money - itemSlot.price > 0) && (itemSlot.qty > 0)) {
			return1.change = money - itemSlot.price;
			return1.Item = location.remove(loc).getItem();
		} else {
			return1.change = money;
		}

		return return1;
	}

	public void fillVendingMachine(Item item, double price, int qty, String loc) {

		ItemSlot itemSlot = new ItemSlot(item, price, qty);
		location.put(loc, itemSlot);

	}

	public void vendingMachineContents() {
		location.forEach(
				(loc, ItemSlot) -> System.out.println("Key: " + loc + "  Value: " + ItemSlot.toString()));
	}
}
