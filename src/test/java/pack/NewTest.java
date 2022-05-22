package pack;
import org.testng.annotations.Test;

import com.xpandit.testng.annotations.Xray;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;		
		

public class NewTest {		
    private WebDriver driver;		
	@Test
	@Xray (requirement = "LDB-372", test="LDB-372")
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("lm")); 	
		
		assertEquals(title,"Demo Guru99 Page");
	}	
	
	@Test
	public void testThialy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		assertEquals(title,"Demo Guru99 Pag");
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