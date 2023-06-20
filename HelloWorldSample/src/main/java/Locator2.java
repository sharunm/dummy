import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");  
		ChromeOptions co = new ChromeOptions();
	    co.addArguments(Arrays.asList("--remote-allow-origins=*",  "--lang=en_US"));

	    WebDriver driver=new ChromeDriver(co); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebElement username=driver.findElement(By.id("inputUsername"));
		username.sendKeys("saranya");
		WebElement password=driver.findElement(By.name("inputPassword"));
		password.sendKeys("rahulshettyacademy");
		WebElement Submitbutton=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button"));
		Submitbutton.click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException



	{

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.linkText("Forgot your password?"));

	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();

	String passwordText =driver.findElement(By.cssSelector("form p")).getText();

	//Please use temporary password 'rahulshettyacademy' to Login.

	String[] passwordArray = passwordText.split("'");

	// String[] passwordArray2 = passwordArray[1].split("'");

	// passwordArray2[0]

	String password = passwordArray[1].split("'")[0];

	return password;

	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.



	//0th index - rahulshettyacademy

	//1st index - to Login.





	}













	}

