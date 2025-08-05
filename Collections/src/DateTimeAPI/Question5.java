package DateTimeAPI;

import java.time.LocalTime;

public class Question5 {
	public static void main(String[] args) {
		LocalTime presentTime=LocalTime.now();
		System.out.println("Time right now: "+presentTime);
		LocalTime after25mins=presentTime.plusMinutes(25);
		System.out.println("Time after 25 minites: "+after25mins);
	}

}
