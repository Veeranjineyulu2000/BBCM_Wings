package PP;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class First {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
