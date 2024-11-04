
package JavaProject1;
import java.util.*;
public class mathFuncttion {

		public static void main (String args[])
		
		{
		Scanner sc =new Scanner(System.in);  
		int sum; int multiplication; int sub; int div;
	
		
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter Second number");
		int y = sc.nextInt();
		sum= x+y;
		multiplication= x*y;
		sub= x-y;
		div= x/y;
	
		
		System.out.println( "The sum of two numbers is " + sum);
		System.out.println( "The subtraction of two numbers is " + sub);
		System.out.println( "The multiplication of two numbers is " + multiplication);
		System.out.println( "The division of two numbers is " + div);
			
			
			
		}
}
