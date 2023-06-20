import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments(Arrays.asList("--remote-allow-origins=*", "--lang=en_US"));

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='_frames']")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-top");



		driver.switchTo().frame("frame-middle");



		System.out.println(driver.findElement(By.id("content")).getText());



		

		
		
		
		
	}

}
