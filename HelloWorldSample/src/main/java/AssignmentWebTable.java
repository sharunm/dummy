import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments(Arrays.asList("--remote-allow-origins=*", "--lang=en_US"));

		WebDriver driver = new ChromeDriver(co);
		driver.get("http://qaclickacademy.com/practice.php");


		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		WebElement table=driver.findElement(By.id("product"));
		int rowscount=table.findElements(By.cssSelector("tbody tr")).size();
		System.out.println(rowscount);
		int columncount=table.findElements(By.cssSelector("tbody tr th")).size();
		System.out.println(columncount);
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());



		System.out.println(secondrow.get(2).getText());
		
	}	

}
