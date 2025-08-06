package com.wipro.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.wipro.task.DailyTasks;

//import 
public class TestStringConcate {
	
	@Test
	public void testDoStringConcat() {
		DailyTasks concate=new DailyTasks();
		String result=concate.doStringConcat("Good","Morning");
		assertEquals("GoodMorning",result);
	}

	

}
