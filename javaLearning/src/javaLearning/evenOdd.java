package javaLearning;
import java.util.*;
public class evenOdd {
	public static void main( String[] args)
	{
		Scanner sc= new Scanner(System.in);
		double x, y;
		System.out.println("Enter the number");
		x= sc.nextDouble();
		
		if (x%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
