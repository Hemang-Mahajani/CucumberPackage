package TestNGDemoPack;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class dataproviderclass {
	
	
	@DataProvider (name = "TestDataforlogin")
	public String[][] datasupplier() {
			String [][] data= {{"https://tutorialsninja.com/demo/", "hemangmahajani10@gmail.com", "12345"},
					{"https://tutorialsninja.com/demo/", "hemangmahajani10@gmail.com", "123456"}	,
					{"https://tutorialsninja.com/demo/", "hemangmahajani09@gmail.com", "12345",}};
		
			return data;
		}

}
