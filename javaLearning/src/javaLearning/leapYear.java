package javaLearning;
import java.util.*;
public class leapYear {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Given: Check if the provided year is a leap year or not");
		System.out.println("Enter the year to be checked for leap year");
		
		int y= sc.nextInt();
		
		if (y % 4 ==0 && y % 100 !=0)
		{
			System.out.println("Provided year is a leap year");
		}
		else 
		{
			System.out.println("Provided year is not a leap year");
		}
		
	}

}
