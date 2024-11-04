
package javaLearning;
import java.util.*;
public class area {
	public static void main (String args[])
	{
	
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter Legnth");
		int x= sc.nextInt();
		System.out.println("Enter Width");
		int y= sc.nextInt();
		
		int area;
		area= x*y;
		System.out.println("Area of rectangle of provided dimenstions is : " + area);
	}
	
	}}

	
