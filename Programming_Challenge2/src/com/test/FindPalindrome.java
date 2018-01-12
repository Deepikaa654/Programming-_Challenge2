package com.test;
import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) throws java.lang.Exception{
		String reverse="";
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String initial=scn.nextLine();
		
		//to remove whitespace and punctuation
		String inputstr= initial.toLowerCase().replaceAll("\\W", "");

		reverse=new StringBuilder(inputstr).reverse().toString(); 
	
		if((inputstr).equalsIgnoreCase(reverse)==true) 
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
		
		scn.close();
	}

}
