import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapHW {
	public static void main(String[] args) {
		
		/* 2. You are a car dealer. Create a hash map of vehicles.
		- The model is the Key, the make is the Value.
		- Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
		- (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
		 */

		Scanner input = new Scanner(System.in);
		
		Map<String, String> carInv = new HashMap<>();
		
		carInv.put("Hyundai", "Sonata");
		carInv.put("Chevrolet", "Silverado");
		carInv.put("Mazda", "Miata");
		carInv.put("Jeep", "Wrangler");
		carInv.put("Honda", "Civic");
		carInv.put("Dodge", "Ram");
		carInv.put("Kia", "Soul");
		carInv.put("Ford", "Edge");
		
		
		System.out.println("Enter the make you are looking for");
		String make = input.nextLine();
		
		System.out.println("Enter the model you are looking for");
		String model = input.nextLine();

		
		if(carInv.containsValue(model)) {
				System.out.println("Oh, you're looking for a " + model + "? Our " + make + " selection is right over here...");
		} else {
			System.out.println("Oh, you're looking for a " + model + "? We actually dont have any of those " + make + " models in stock.");
		}

	}

}
