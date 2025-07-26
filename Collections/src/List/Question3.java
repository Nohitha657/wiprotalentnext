package List;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
		list.add(sc.next());
		}
		printAll(list);
	}
	static void printAll(ArrayList<String> list) {
		for(String element:list) {
			System.out.println(element);
	}
	}
}
	



