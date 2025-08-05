package Map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Question3 {


    public static void main(String[] args) {
        Properties states = new Properties();

        // Adding some states and their capitals
        states.setProperty("Telangana", "Hyderabad");
        states.setProperty("Maharashtra", "Mumbai");
        states.setProperty("Karnataka", "Bengaluru");
        states.setProperty("Tamil Nadu", "Chennai");

        // Use Iterator to list all elements
        System.out.println("States and Capitals:");
        Set<Object> keys = states.keySet();
        Iterator<Object> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String state = (String) iterator.next();
            String capital = states.getProperty(state);
            System.out.println(state + " => " + capital);
        }
    }
}

