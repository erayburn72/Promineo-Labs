package week05VendingMachine;

public class Week05VendingMachineLab {

	public static void main(String[] args) {

		/*
		 * Vending Machine:
		 *
		 * Create the following four classes: VendingMachine, ItemSlot, Item, and Return
		 *
		 * a. VendingMachine: will contain a Map<String, ItemSlot> where the String will
		 * represent the location in the vending machine (i.e. "A4")
		 *
		 * b. ItemSlot: will contain an item, the item's price, and the quantity of that
		 * item in that slot
		 *
		 * c. Item: will contain a description
		 *
		 * d. Return: will have a field for an Item and a double for any change. The
		 * Return is what will be returned to each user using the vending machine.
		 *
		 * VendingMachine should have two methods:
		 *
		 * a. a method that takes a double (money) and a location (i.e. "A4") and
		 * returns a Return containing any change and the item. If the supplied money
		 * was insufficient to purchase the item, the Return should contain just the
		 * money (item should be null).
		 *
		 * b. a method that takes an Item, int (quantity), price and string (location)
		 * and will create an ItemSlot based on the input.
		 *
		 */

		// 1a. Create VendingMachine
		VendingMachine vendingMachine = new VendingMachine();

		// 1c. Create Item (before the slot)
		Item item1 = new Item("Candy Bar");
		Item item2 = new Item("Drink");
		Item item3 = new Item("Sandwich"); // Fancy VendingMachine

		// 1b. Create ItemSlot (now that we have an item)
		ItemSlot itemSlot1 = new ItemSlot(item1, 1.25, 10);
		ItemSlot itemSlot2 = new ItemSlot(item2, 1.50, 10);
		ItemSlot itemSlot3 = new ItemSlot(item3, 1.75, 10);

		// Load the VendingMachine
		vendingMachine.fillVendingMachine(item1, itemSlot1.getPrice(), itemSlot1.getQty(), "A1");
		vendingMachine.fillVendingMachine(item2, itemSlot2.getPrice(), itemSlot2.getQty(), "A2");
		vendingMachine.fillVendingMachine(item3, itemSlot3.getPrice(), itemSlot3.getQty(), "A3");

		// As I heard in a song once..."Buy me Something!"...

		vendingMachine.vendingMachineContents();

		// Order from Vending Machine

		double money = 5.00;

		// Buy Something!

		Return return1 = vendingMachine.BuySomething(money, "A1");
		return1.ChangeLeft();
		money = return1.change;
		Return return2 = vendingMachine.BuySomething(money, "A2");
		return2.ChangeLeft();
		money = return2.change;
		Return return3 = vendingMachine.BuySomething(money, "A3");
		return3.ChangeLeft();
		money = return3.change;
		
	}

}
