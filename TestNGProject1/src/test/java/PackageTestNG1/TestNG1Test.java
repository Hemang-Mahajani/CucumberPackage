package PackageTestNG1;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1Test {
	


@Test(groups = "Java")
public void PrintTest1()
{
	System.out.println("I am Sr. QA Engineer - Hemang");
	
}

	
	@BeforeTest
	public void TeamIntro()
	{
		System.out.println("This is just an observed understanding");
		
	
	}
	
	@Test
	public void PrintTest()
	{
		System.out.println("HI am Writing this just for fun");
		
	}   
	
	
	@AfterTest
	public void PrintTest2()
	{
		System.out.println("HI hope I finish this someday");
			
	}

}



