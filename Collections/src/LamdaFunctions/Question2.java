package LamdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(
            "apple", "banana", "cat", "dog", "elephant",
            "fish", "grape", "hat", "ice", "jungle"
        ));

        System.out.println("Original List: " + al);

        // Print in reverse using lambda and ListIterator
        System.out.println("Reversed List:");
        Collections.reverse(al);
        al.forEach(s -> System.out.println(s));
    }
}
