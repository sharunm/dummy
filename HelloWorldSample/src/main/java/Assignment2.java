import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");  
		ChromeOptions co = new ChromeOptions();
	    co.addArguments(Arrays.asList("--remote-allow-origins=*",  "--lang=en_US"));

	    WebDriver driver=new ChromeDriver(co); 
	    driver.get("https://www.rahulshettyacademy.com/angularpractice/");
	    driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Saranya Sridharan");
	    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sharunmfeb@gmail.com");
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456789");
	    driver.findElement(By.id("exampleCheck1")).click();
	   WebElement dropdown= driver.findElement(By.id("exampleFormControlSelect1"));
	   dropdown.click();
	   Select options= new Select(dropdown);
	   options.selectByVisibleText("Female");
	   driver.findElement(By.id("inlineRadio1")).click();
	   driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12/03/1984");
	   driver.findElement(By.cssSelector("input[type='submit']")).click();
	  System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	}
}
	
	
