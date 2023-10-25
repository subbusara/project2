package com.ags;

import java.util.ArrayList;

public class DemoEnum {
	
	public enum days{

		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,saturday,sunday

	}
	public static void main(String[]args) {
	
		days[] values = days.values();
		int length = values.length;
		System.out.println(values[2]);
		
		//normal for loop
		
		for(int i=0; i<values.length;i++)
		{
			System.out.println(values[i]);
			
		}
		//using enchanced forloop
		for
		(days days:values) {
			System.out.println(days);
			System.out.println(days);
			
			
			
		}
		
		
	}

}
