package DateTimeAPI;

import java.time.LocalTime;

public class Question6 {
	public static void main(String[] args) {
		LocalTime current=LocalTime.now();
		System.out.println("Current time: "+current);
		LocalTime before5hr30mins=current.minusHours(5).minusMinutes(30);
		System.out.println("Time before 5hr 30mins: "+before5hr30mins);
	}

}
