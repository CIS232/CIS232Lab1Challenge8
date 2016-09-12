package eight;

import java.util.Scanner;

public class NumberEight {	
	public static void main(String[]args){
		 //Write a program that asks the user to enter a
	     //series of numbers separated by commas. Here is
	     //an example of valid input: 7,9,10,2,18,6
	     //The program should calculate and display the sum
	     //of all the numbers.
	       
	     Scanner keyboard = new Scanner(System.in);
	       
	     int sum = 0; //using int instead of string because we are
	                     //dealing with numbers
	               
	     System.out.println("Enter a series of numbers "
	                + "separated by commas: ");
	     String userInput = keyboard.nextLine();
	     String[]tokens = userInput.split("[,]"); //splitting string of array; literal
	       
	     for(int i = 0; i < tokens.length; i++){ //i++=iterating the array, increments
	         sum += Integer.parseInt(tokens[i]); //number after expression; l=breaks
	        }                                    //up the string into tokens; parse
	                                             //returns int
	     System.out.println("The sum of these numbers is "
	                + sum);
	 }
}
