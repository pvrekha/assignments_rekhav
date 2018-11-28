package day29;

import java.util.ArrayList;

public class ColorArray {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Green");
		colors.add("New York");

		for (String t : colors)
			if (t.equals("Red")||(t.equals("Orange"))){
				System.out.println("Have dinner in a restaurant");
			}
			 else {
				System.out.println("Today is Friday");
			}

	}
}
//The logic is correct but HAve dinner in a restaurant had to be printed only once