package code.javacodegeeks.junit;

import java.util.Arrays;

public class FirstDayAtSchool {
	
	public String[] prepareMyBag() {
		String[] schoolbag = { "Books", "Notebooks", "Pens"};
		System.out.println("My schoolbag contains: " + Arrays.toString(schoolbag));
		return schoolbag;
	}
	
	public String[] addPencils() {
		String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils"};
		System.out.println("Now my schoolbag conains:" + Arrays.toString(schoolbag));
		return schoolbag;
	}

}
