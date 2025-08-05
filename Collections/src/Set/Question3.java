package Set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Set<String> tree=new TreeSet<>();
	tree.add("Apple");
	tree.add("Banana");
	tree.add("Orange");
	tree.add("grapes");
	
	System.out.println(tree);
	
	System.out.println(((TreeSet<String>) tree).descendingSet());
	
	
	System.out.println("Enter the word to search: ");
	String target=sc.next();
	
	
	boolean found = false;

    for (String item : tree) {
        if (item.equalsIgnoreCase(target)) {
            found = true;
            break;
        }
    }

    if (found)
        System.out.println(target + " is found!");
    else
        System.out.println(target + " is not found.");
	}
}

