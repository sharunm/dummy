import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignmentcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");  
		ChromeOptions co = new ChromeOptions();
	    co.addArguments(Arrays.asList("--remote-allow-origins=*",  "--lang=en_US"));

	    WebDriver driver=new ChromeDriver(co); 
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    //driver.findElement(By.id("checkBoxOption1")).click();
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    List<WebElement> options=driver.findElements(By.cssSelector("input[type='checkbox']"));
	    for (WebElement option : options) {
			option.click();
		}
	}

}
