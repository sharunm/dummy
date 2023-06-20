import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments(Arrays.asList("--remote-allow-origins=*", "--lang=en_US"));

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/");
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.cssSelector("a[href*='windows']")).click();

		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		String parentWindow = it.next();

		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
