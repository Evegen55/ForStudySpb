package com.javacodegeeks.junit;

import java.util.Arrays;

public class FirstDayAtSchool {
	
	public String[] prepareMyBag() {
		String[] schoolbag = { "Books", "Notebooks", "Pens" };
		System.out.println("My school bag contains: "
				+ Arrays.toString(schoolbag));
		return schoolbag;
	}
	
	public String[] addPencils() {
	String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils" };
	System.out.println("Now my school bag contains: "
			+ Arrays.toString(schoolbag));
	return schoolbag;
	}
}
