import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWebDriver\\chrome Driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments(Arrays.asList("--remote-allow-origins=*", "--lang=en_US"));

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement chkbox=driver.findElement(By.id("checkBoxOption1"));
		chkbox.click();
		String data=chkbox.getText();
		System.out.println(data);
		WebElement dropdownoptions= driver.findElement(By.id("dropdown-class-example"));
		dropdownoptions.click();
		Select select=new Select(dropdownoptions);
		select.selectByVisibleText("data");
		driver.findElement(By.id("name")).sendKeys(data);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext=driver.switchTo().alert().getText();
		if(alerttext.contains(data)) {
			System.out.println(alerttext);
			
		}
		else {
			System.out.println("Itswrong");
		}
				
		}
		
	

}
