package Map;

import java.util.*;



public class Question6 {
    Hashtable<String, String> table = new Hashtable<>();

    // 1. Save country and capital
    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        table.put(countryName, capital);
        return table;
    }

    // 2. Get capital by country name
    public String getCapital(String countryName) {
        return table.get(countryName);
    }

    // 3. Get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : table.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null; // If not found
    }

    // 4. Create reverse map (capital -> country)
    public Hashtable<String, String> createCapitalCountryMap() {
    	Hashtable<String, String> table2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : table.entrySet()) {
           table2.put(entry.getValue(), entry.getKey());
        }
        return table2;
    }

    // 5. Create ArrayList of all country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(table.keySet());
    }

    // Main method to test
    public static void main(String[] args) {
        Question6 obj = new Question6();
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

