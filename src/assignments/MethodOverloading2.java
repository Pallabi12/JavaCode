package assignments;

import java.util.ArrayList;

public class MethodOverloading2 {

	
	public static int restaurant(String name) {
		System.out.println(	"Search by Restaurant name");
		return 100;
	}
	
	public static void restaurant(String name, String foodItem) {
		System.out.println(	"Search by Restaurant name and FoodItem");
		ArrayList<String> menu = new ArrayList<String>();
		menu.add(0, foodItem);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
