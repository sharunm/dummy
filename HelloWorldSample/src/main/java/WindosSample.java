import java.util.Arrays;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Set;
import java.util.Iterator;
public class WindosSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromeDriver\\chromedriver_win32\\chromedriver.exe");  
		ChromeOptions co = new ChromeOptions();
	    co.addArguments(Arrays.asList("--remote-allow-origins=*",  "--lang=en_US"));

	    WebDriver driver=new ChromeDriver(co); 
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	    driver.findElement(By.cssSelector(".blinkingText")).click();
	    Set<String> windows=driver.getWindowHandles();
	    Iterator<String> it=windows.iterator();
	    String parentid=it.next();
	    String childid=it.next();
	    driver.switchTo().window(childid);
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

	    driver.findElement(By.cssSelector(".im-para.red")).getText();
	    String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	    System.out.println(emailid);
	    driver.switchTo().window(parentid);
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys(emailid);
	    
	}

}
