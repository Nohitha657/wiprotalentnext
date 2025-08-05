package Map;

import java.util.*;

public class Question1 {
    HashMap<String, String> M1 = new HashMap<>();

    // 1. Save country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null; // If not found
    }

    // 4. Create reverse map (capital -> country)
    public HashMap<String, String> createCapitalCountryMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Create ArrayList of all country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test
    public static void main(String[] args) {
        Question1 obj = new Question1();
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
