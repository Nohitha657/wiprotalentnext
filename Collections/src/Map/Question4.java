package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Question4 {
	public static void main(String[] args) {
	HashMap<String,Integer> ContactList=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	ContactList.put("Rama",1234567890);
	ContactList.put("Ram",1917654321);
	ContactList.put("vara",1324365754);
	ContactList.put("Ramu",1234765490);
	ContactList.put("sita",1265437890);
	
	System.out.println("Enter the key to search: ");
	String KeyToCheck=sc.next();
    if (ContactList.containsKey(KeyToCheck)) {
        System.out.println("Key '" + KeyToCheck + "' exists.");
    } else {
        System.out.println("Key '" + KeyToCheck + "' does not exist.");
    }
    
    System.out.println("Enter the value to search: ");
    Integer valueToCheck = sc.nextInt();
    if (ContactList.containsValue(valueToCheck)) {
        System.out.println("Value '" + valueToCheck + "' exists.");
    } else {
        System.out.println("Value '" + valueToCheck + "' does not exist.");
    }
    
    System.out.println("\nIterating using Iterator:");
    Iterator<Entry<String, Integer>> it =ContactList.entrySet().iterator();
    while (it.hasNext()) {
        Entry<String, Integer> entry = it.next();
        System.out.println(entry.getKey() + " => " + entry.getValue());
    }
	
	}
}
