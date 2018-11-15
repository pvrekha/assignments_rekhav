package day23;

import java.util.ArrayList;

public class ArrayIntegers {
	
	public static void main(String[] args) {
		ArrayList<String>Integers = new ArrayList<>();
		
	Integers.add("10");
	Integers.add("20");
	Integers.add("30");
	Integers.add("40");
	Integers.add("50");
	
	
	for (String i:Integers) {
    	System.out.println(i);
    }
    System.out.println("Total number of Integers in the Array List is "+Integers.size());
    System.out.println("Index of the last integer in the Array list is "+Integers.indexOf("50"));
	
	
	}

}
