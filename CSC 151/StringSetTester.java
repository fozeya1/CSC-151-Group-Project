package Classes;

import java.util.Scanner;

public class StringSetTester {

	public static void main(String[] args) {
		
		//create a StringSet object named obj
		StringSet obj = new StringSet();
		
		//take input from user using Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("How many strings would you like to enter? ");
		
		//get input by using .nextLine() method
		//create variable strCount to count number of strings entered using .nextInt() method
		int strCount = input.nextInt();
		input.nextLine();
		
		//use a for loop to prompt user for next string and add each string to our 
		//StringSet object using obj.add(input.nextLine())
		for(int i = 0; i < strCount; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			obj.add(input.nextLine());
		}
		
		//print the number of strings in our object using .size() method
		System.out.println("The arraylist has " + obj.size() + " strings");
		
		//print the number of characters in our object using .numChars() method
		System.out.println("The arraylist has " + obj.numChars() + " characters total.");
		
	    //get substring from user 
		System.out.println("What string do you want to search for?");
		String str = input.nextLine();
		
		//search through all strings for specified substring using the countStrings method
		//on our StringSet object
		System.out.println("There are " + obj.countStrings(str) + " strings with that substring");
		
		//print object
		System.out.println(obj.toString());
		
		//use pop method to remove last value in object
		obj.pop();
		
		//print object again to show last value removed
		System.out.println(obj.toString());
		
		//following best practice, we close input
		input.close();
		
	}
		
	}
		
		
		