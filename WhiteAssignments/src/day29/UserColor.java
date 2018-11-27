package day29;

import java.util.ArrayList;
import java.util.Scanner;

public class UserColor {

	//My Try at Assignment 2 from day29. Accepts red and prints "Dinner in a restaurant" only if Red is the last input value in the array
			 public static void main(String []args){
		     Scanner K=new Scanner(System.in);
		     System.out.println("Enter 5 colors");
		     String j = null;
		     ArrayList<String>colors = new ArrayList<String>();
		     for(int i=0;i<=5;i++)
		     {  
		    	
		         colors.add(j);
		          j=K.nextLine();
		         //System.out.println("printing color" + j);
		     }
		     //if(j==colors.contains("Red")) {
		     		    if (j.equals("Red")){
		     
		    System.out.println("Dinner in a restaurant"+colors);
		     		    }
		    else
		    	System.out.println("No red color found");
		     	  	 j=K.nextLine();
		}
	
			 }

	
	
	

