package com.test;

import java.util.Scanner;
public class StringReversal {
	
	public static void main(String[] args) {
		
		String str="",reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter a string to be reversed :");
		str=in.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		 
		for(int i=(len-1);i>=0;i--){
			reverse+=str.charAt(i);
		}

		System.out.println("Original String after case conversion is:"+str);
		System.out.println("Reversal of a String is:"+reverse);	
		
		in.close();
	}
}
