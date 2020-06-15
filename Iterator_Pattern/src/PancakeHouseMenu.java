import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("K&B's Pancake Breakfast",
				"Pancake with scrambled eggs, and toast",
				true,
				2.99);
		addItem("Regular Pancake Breakfast",
				"Pancake with fried eggs, sausage",
				true,
				2.99);
		addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries",
				true,
				3.99);
		addItem("Waffles",
				"Waffles, with your choice of blueberries or starwberreis",
				true,
				3.59);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
