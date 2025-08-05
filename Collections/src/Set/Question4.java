package Set;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
public class Question4 {
	
	Set<String> set=new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		set.add(CountryName);
		return (TreeSet<String>) set;
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
		Question4 cname=new Question4();
		
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


