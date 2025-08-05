package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Question2 {
	
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
	        // Adding values
	        map.put("India", "Delhi");
	        map.put("Japan", "Tokyo");
	        map.put("USA", "Washington D.C.");
	        map.put("France", "Paris");

	        // a) Check if a key exists
	        String keyToCheck = "India";
	        if (map.containsKey(keyToCheck)) {
	            System.out.println("Key '" + keyToCheck + "' exists.");
	        } else {
	            System.out.println("Key '" + keyToCheck + "' does not exist.");
	        }

	        // b) Check if a value exists
	        String valueToCheck = "Paris";
	        if (map.containsValue(valueToCheck)) {
	            System.out.println("Value '" + valueToCheck + "' exists.");
	        } else {
	            System.out.println("Value '" + valueToCheck + "' does not exist.");
	        }

	        // c) Use Iterator to loop through the map
	        System.out.println("\nIterating using Iterator:");
	        Iterator<Entry<String, String>> it = map.entrySet().iterator();
	        while (it.hasNext()) {
	            Entry<String, String> entry = it.next();
	            System.out.println(entry.getKey() + " => " + entry.getValue());
	        }
	    }
	}

	


