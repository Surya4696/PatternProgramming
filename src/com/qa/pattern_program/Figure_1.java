package com.qa.pattern_program;

public class Figure_1 {

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
		
		for (int a = 1; a <=5; a++)
		{
			for (int b = 0;b < a; b++) 
			{
				System.out.print(" ");
			}
			for (int c = 0; c < 2*(5-a+1)-1 ; c++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
