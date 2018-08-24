package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Runner {
WebDriver driver;
@Test
public void test() 
{
	System.out.println(driver.getTitle());
}
@BeforeTest
public void beforeTest()
{
	System.setProperty("webdriver.gecko.driver", "gecko/geckodriver");
	System.out.println("helllooo");
	driver= new FirefoxDriver();
	driver.get("http://13.251.143.66:8090/IPL-Fantasy-League-0.0.1-SNAPSHOT/");

}
@AfterTest
public void afterTest(){
	System.out.println("Running1");
}
}
