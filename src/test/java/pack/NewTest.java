package pack;
import org.testng.annotations.Test;

import com.xpandit.testng.annotations.Xray;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;		
		

public class NewTest {		
    private WebDriver driver;		
	@Test
	@Xray (requirement = "LDB-373", test="LDB-372")
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}	
