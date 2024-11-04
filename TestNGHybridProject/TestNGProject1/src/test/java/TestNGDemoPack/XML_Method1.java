package TestNGDemoPack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class XML_Method1 {
	
	@Test
	public void methodA() 
	{System.out.println("Print from MethodA");}
	
	@Test(priority = 1, groups = "regression")
	public void methodB() 
	{System.out.println("Print from MethodB");}
	
	@Test
	public void methodC() 
	{System.out.println("Print from MethodC");}

}
