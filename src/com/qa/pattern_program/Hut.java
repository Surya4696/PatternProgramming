package com.qa.pattern_program;

public class Hut {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++)
		{
			for (int k = 0;k < (5-i+1); k++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1 ; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 1; i <=5; i++)
		{
			for (int k = 0; k < 1; k++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 9; j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
