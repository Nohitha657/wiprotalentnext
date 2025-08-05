package Map;

import java.util.*;

public class Question5 {
    TreeMap<String, String> tree = new TreeMap<>();

    // 1. Save country and capital
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        tree.put(countryName, capital);
        return tree;
    }

    // 2. Get capital by country name
    public String getCapital(String countryName) {
        return tree.get(countryName);
    }

    // 3. Get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : tree.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create reverse map (capital -> country)
    public TreeMap<String, String> createCapitalCountryMap() {
    	TreeMap<String, String> tree2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : tree.entrySet()) {
            tree2.put(entry.getValue(), entry.getKey());
        }
        return tree2;
    }

    // 5. Create ArrayList of all country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(tree.keySet());
    }

    // Main method to test
    public static void main(String[] args) {
        Question5 obj = new Question5();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name: ");
            String country = sc.next();
            System.out.print("Enter capital: ");
            String capital = sc.next();
            obj.saveCountryCapital(country, capital);
        }

        // Testing the methods
        System.out.print("\nEnter country to find capital: ");
        String countrySearch = sc.next();
        System.out.println("Capital: " + obj.getCapital(countrySearch));

        System.out.print("Enter capital to find country: ");
        String capitalSearch = sc.next();
        System.out.println("Country: " + obj.getCountry(capitalSearch));

        System.out.println("\nCapital-Country Map: " + obj.createCapitalCountryMap());
        System.out.println("All Countries: " + obj.getAllCountries());

        sc.close();
    }
}
