package StreamAPI;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Integer> list1=new ArrayList<>();
	    
	    ArrayList<Integer> list2=new ArrayList<>();
	    
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        list1.add(sc.nextInt());
	    }
	    for(int i=0;i<list1.size();i++){
	        int val = list1.get(i);
	        if(val<0 && val%2==0){
	           list2.add(val);
	            
	        }
	    }
		System.out.println(list2);
	}


}
