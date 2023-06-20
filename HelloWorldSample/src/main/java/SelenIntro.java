import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class SelenIntro {

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
		password.sendKeys("saranya");
		WebElement Submitbutton=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button"));
		Submitbutton.click();
		
		WebElement errormessage=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p"));
		WebElement forgotpassword=driver.findElement(By.linkText("Forgot your password?"));
		forgotpassword.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("saranya");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("sharunmfeb@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("+61467517061");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();
		driver.findElement(By.className("infoMsg"));
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	//driver.getTitle();
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	
	}

}
