package day31;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2Lists {
	public static void main(String[] args) {
		
	ArrayList<String>junk = new ArrayList<>();
	
	junk.add("Dosa");
	junk.add("Idli");
	junk.add("Roti");
	junk.add("Vada");
	junk.add("Pakoda");
	
	ArrayList<String>fruits = new ArrayList<>();
	fruits.add("kiwi");
	fruits.add("apple");
	fruits.add("mango");
	fruits.add("pineapple");
	fruits.add("strawberry");
	
	System.out.println(junk.get(0)+fruits.get(0));
	System.out.println(junk.get(1)+fruits.get(1));
	System.out.println(junk.get(2)+fruits.get(2));
	System.out.println(junk.get(3)+fruits.get(3));
	System.out.println(junk.get(4)+fruits.get(4));

	
	}
	
	
}
