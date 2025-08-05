package DateTimeAPI;

import java.time.LocalDate;

public class Question1 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("today's date: "+today);
		
		LocalDate tendayslater=today.plusDays(10);
		System.out.println("date after 10 days: "+tendayslater);
	}
}
