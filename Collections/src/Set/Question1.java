package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Question1 {
	HashSet<String> set=new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		set.add(CountryName);
		return set;
	}
	public String getCountry(String CountryName) {
		for(String name:set) {
			if(set.contains(CountryName)) 
			
			return CountryName;
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Question1 cname=new Question1();
		
		System.out.print("Enter number of countries: ");
	    int n = sc.nextInt();
	    
	    System.out.println("Enter country names:");
        for (int i = 0; i < n; i++) {
            String country = sc.next();
            cname.saveCountryNames(country);
        }
        System.out.print("Enter country to search: ");
        String search = sc.next();
        
        String result = cname.getCountry(search);
        System.out.println(result);
		
	}

}
