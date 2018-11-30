package day31;

import java.util.ArrayList;
import java.util.Scanner;

public class BMWArray {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		Scanner K = new Scanner(System.in);
		boolean isthere = false;

		while (!isthere) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter 5 cars");
				String j = K.nextLine();
				cars.add(j);
			}

			for (String cc : cars) {

				if (cc.equals("BMW")) {
					isthere = true;
				}
			}
			if (isthere) {
				System.out.println("It is there");
			} else
				System.out.println("Not found");

		}

	}

}
//Perfect